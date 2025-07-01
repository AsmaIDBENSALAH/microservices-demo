package com.example.orderservice.client;

import org.springframework.stereotype.Component;

@Component
public class ProductClientFallback implements ProductClient {
    @Override
    public String getProductById(Long id) {
        return "Fallback: Product Service is unavailable for id " + id;
    }
}

