package com.gazorpazorp.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.gazorpazorp.model.Product;

import feign.Headers;

@FeignClient(name="lcbo-client", url="${lcbo-client.url}") //Name can be custom name defined in bootstrap.yml, or the name of a service registered with eureka
public interface LCBOFeignClient {
	
	@GetMapping(value="/products", consumes = "application/json")
	@Headers(value = { "Authorization: Token MDo1NDQwN2RjYy0wMDhkLTExZTctYWEwNy0yMzI4NjgxOTRjOWU6V2hSaDdoOXBVbjFjTU80cUtBZlpxRkI4UlJDVWcxRWlBUWZZ", "Content-Type: application/json"})
	Product getProductById(@PathVariable("id") Long id);
}

