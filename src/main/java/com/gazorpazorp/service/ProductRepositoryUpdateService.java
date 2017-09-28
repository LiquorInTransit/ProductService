package com.gazorpazorp.service;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gazorpazorp.model.Dataset;
import com.gazorpazorp.model.DatasetResult;
import com.gazorpazorp.repository.ProductRepository;

@Service
public class ProductRepositoryUpdateService extends Thread {
	Logger logger = LoggerFactory.getLogger(ProductRepositoryUpdateService.class);
	
	@Autowired
	Integer latestUpdate;
	
	@Autowired
	ProductRepository productRepo;
	@Autowired
	ProductService productService;
	
	String key = "MDo1NDQwN2RjYy0wMDhkLTExZTctYWEwNy0yMzI4NjgxOTRjOWU6V2hSaDdoOXBVbjFjTU80cUtBZlpxRkI4UlJDVWcxRWlBUWZZ";
	
	@Override
	public void run() {
		logger.error("For some reason the update service is starting right away");
		RestTemplate datasetTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set(headers.AUTHORIZATION, "Token " + key);
		HttpEntity entity = new HttpEntity(headers);

		Dataset latestDataset = datasetTemplate
				.exchange("https://www.lcboapi.com/datasets/latest", HttpMethod.GET, entity, DatasetResult.class)
				.getBody().getResult();
		
		if (latestDataset.getId() != latestUpdate) {
			logger.info("Cron job update to latest dataset");
			addProducts(latestDataset);
			removeProducts(latestDataset);
		}
	}
	
	
	private void addProducts(Dataset dataset) {
		productRepo.saveAll(productService.getProductsById(dataset.getAddedProductIds().stream().map(Object::toString).collect(Collectors.joining(","))));
	}
	private void removeProducts(Dataset dataset) {
		dataset.getRemovedProductIds().forEach(id -> productRepo.deleteById(id));
	}
}
