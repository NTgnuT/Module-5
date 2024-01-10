package com.example.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class CategoryController {
    @GetMapping("/category")
    public ResponseEntity<?> getCategory () {
        return new ResponseEntity<>("Có dữ liệu", HttpStatus.OK);
    }
}
