package com.example.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "product-service",
        fallback = ProductClientFallback.class
)
public interface ProductClient {
    @GetMapping("/products/{id}")
    String getProductById(@PathVariable("id") Long id);
}
