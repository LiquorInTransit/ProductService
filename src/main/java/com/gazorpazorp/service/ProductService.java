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

import com.gazorpazorp.client.LCBOClient;
import com.gazorpazorp.model.Product;
import com.gazorpazorp.model.ProductResult;

@Service
public class ProductService {

//	@Autowired
//	ProductRepository productRepo;
	@Autowired
	LCBOClient lcboClient;
	
	//TODO: These will not contact the lcboapi. they will contact the repo.
	String key = "MDo1NDQwN2RjYy0wMDhkLTExZTctYWEwNy0yMzI4NjgxOTRjOWU6V2hSaDdoOXBVbjFjTU80cUtBZlpxRkI4UlJDVWcxRWlBUWZZ";
	
	//this shit is working and its a pain in my fucking asshole
	public Product getProductById(Long productId) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set(headers.AUTHORIZATION, "Token "+key);
		HttpEntity entity = new HttpEntity(headers);
		ProductResult result = restTemplate.exchange("https://www.lcboapi.com/products/"+productId, HttpMethod.GET, entity, ProductResult.class).getBody();
		return result.getResult();
	}
	
	public List<Product> getProductsById(String productIds) {
		return Arrays.asList(productIds.split(",")).stream().map(id -> getProductById(Long.parseLong(id))).collect(Collectors.toList());
	}
}
