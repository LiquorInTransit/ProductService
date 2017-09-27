package com.gazorpazorp.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.gazorpazorp.model.Product;

import feign.Param;

@FeignClient(name="lcbo-client") //Name can be custom name defined in bootstrap.yml, or the name of a service registered with eureka
public interface LCBOClient {
	
	@GetMapping(value="/{id}", consumes = "application/json")
	Product getProductById(@Param("id") Long id);
}

