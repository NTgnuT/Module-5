package com.example.Controller;

import com.example.dto.response.ProductResponse;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public ResponseEntity<?> getAllProduct () {
        List<ProductResponse> list = productService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
