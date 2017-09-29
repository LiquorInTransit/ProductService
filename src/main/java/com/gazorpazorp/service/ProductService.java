package com.gazorpazorp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gazorpazorp.model.Product;
import com.gazorpazorp.model.ProductResult;
import com.gazorpazorp.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	//TODO: These will not contact the lcboapi. they will contact the repo.
	String key = "MDo1NDQwN2RjYy0wMDhkLTExZTctYWEwNy0yMzI4NjgxOTRjOWU6V2hSaDdoOXBVbjFjTU80cUtBZlpxRkI4UlJDVWcxRWlBUWZZ";
	
	public Product getProductById(Long productId) {
		return productRepo.findById(productId).get();
	}
	
	public List<Product> getProductsById(String productIds) {
		return productRepo.findAllById(Arrays.asList(productIds.split(",")).stream().map(Long::parseLong).collect(Collectors.toList()));
		//return Arrays.asList(productIds.split(",")).stream().map(id -> getProductById(Long.parseLong(id))).collect(Collectors.toList());
	}
}
