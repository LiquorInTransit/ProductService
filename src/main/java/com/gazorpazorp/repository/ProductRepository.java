package com.gazorpazorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gazorpazorp.model.Product;

@RepositoryRestResource(exported=false)
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
