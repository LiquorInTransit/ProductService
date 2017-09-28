package com.gazorpazorp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gazorpazorp.model.Product;
import com.gazorpazorp.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/{productId}")
	public ResponseEntity getSampleById (@PathVariable Long productId) throws Exception {
		return Optional.ofNullable(productService.getProductById(productId))
				.map(p -> new ResponseEntity<Product>(p, HttpStatus.OK))
				.orElseThrow(() -> new Exception("An unknown error has occured."));
	}

	
	
}
