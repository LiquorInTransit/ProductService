package com.gazorpazorp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gazorpazorp.client.LCBOClient;
import com.gazorpazorp.model.Product;
import com.gazorpazorp.repository.SampleRepository;

@Service
public class ProductService {

//	@Autowired
//	ProductRepository productRepo;
	@Autowired
	LCBOClient lcboClient;
	
	
	

	public Product getProductById(Long productId) {
		return lcboClient.getProductById(productId);
	}
}
