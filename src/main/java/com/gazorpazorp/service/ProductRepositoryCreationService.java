package com.gazorpazorp.service;

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
public class ProductRepositoryCreationService extends Thread {
	Logger logger = LoggerFactory.getLogger(ProductRepositoryCreationService.class);

	@Autowired
	ProductRepository productRepo;

	@Autowired
	ProductService productService;

	String key = "MDo1NDQwN2RjYy0wMDhkLTExZTctYWEwNy0yMzI4NjgxOTRjOWU6V2hSaDdoOXBVbjFjTU80cUtBZlpxRkI4UlJDVWcxRWlBUWZZ";

	@Override
	public void run() {
		// get the dataset
		RestTemplate datasetTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set(headers.AUTHORIZATION, "Token " + key);
		HttpEntity entity = new HttpEntity(headers);

		Dataset result = datasetTemplate
				.exchange("https://www.lcboapi.com/datasets/latest", HttpMethod.GET, entity, DatasetResult.class)
				.getBody().getResult();

		// loop through the products, get them all, and save them all
		parseAndSaveDataset(result);

	}

	private void parseAndSaveDataset(Dataset dataset) {

		for (long x = 0; x < dataset.getTotalProducts(); x++) {
			Long id = dataset.getProductIds().get((int) x);
			try {
				productRepo.save(productService.getProductById(id));
			} catch (Exception e) {
				//e.printStackTrace();
				logger.error("Failed to persist product with id: " + id + ". " + e.getMessage());
			}
			if (x % 100 == 0)
				productRepo.flush();
		}

	}

}
