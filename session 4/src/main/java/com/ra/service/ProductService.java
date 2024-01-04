package com.ra.service;

import com.ra.model.entity.Category;
import com.ra.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product saveOrUpdate(Product product);
    Product findById (Long id);
    void delete(Long id);
}
