package com.gazorpazorp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gazorpazorp.model.Product;


public interface SampleRepository extends JpaRepository<Product, Long> {
	public List<Product> findByCustomerId(@Param("customerId") Long customerId);
}
