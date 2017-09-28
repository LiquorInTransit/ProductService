package com.gazorpazorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gazorpazorp.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	//public List<Product> findById(@Param("Id") Long customerId);
	
}
