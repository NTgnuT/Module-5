package com.example.service;

import com.example.dto.request.ProductRequest;
import com.example.dto.response.ProductResponse;
import com.example.model.Product;
import com.example.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAll();
    ProductResponse save (ProductRequest productRequest);
}
