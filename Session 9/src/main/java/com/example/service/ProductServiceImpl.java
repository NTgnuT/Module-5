package com.example.service;

import com.example.dto.request.ProductRequest;
import com.example.dto.response.ProductResponse;
import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UploadService uploadService;
    @Override
    public List<ProductResponse> getAll() {
        List<Product> list = productRepository.findAll();
        return list.stream().map(ProductResponse::new).toList();
    }

    @Override
    public ProductResponse save(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        // upload file
        String fileName = uploadService.uploadImage(productRequest.getFile());

        product.setImage(fileName);
        // lưu vào database
        productRepository.save(product);
        //Convert từ Product Entity => Product Response
        return new ProductResponse(product);
    }
}
