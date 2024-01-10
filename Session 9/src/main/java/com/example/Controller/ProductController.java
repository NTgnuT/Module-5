package com.example.Controller;

import com.example.dto.request.ProductRequest;
import com.example.dto.response.ProductResponse;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/products")
    public ResponseEntity<?> save (@ModelAttribute("product")ProductRequest productRequest) {
        ProductResponse productResponse = productService.save(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }
}
