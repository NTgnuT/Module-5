package com.ra.controller;

import com.ra.model.entity.Category;
import com.ra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/category")
    public ResponseEntity<List<Category>> categories() {
        List<Category> list = categoryService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/category")
    public ResponseEntity<Category> create (@RequestBody Category category) {
        Category newCategory = categoryService.saveOrUpdate(category);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<?> getCat (@PathVariable("id") Long id) {
        Category category = categoryService.findById(id);
        if (category != null) {
            return new ResponseEntity<>(category, HttpStatus.valueOf(200));
        }
        return new ResponseEntity<>("NOT FOUND",HttpStatus.NOT_FOUND);
    }
    // Gửi kèm theo cả id để sửa
//    @PutMapping("/category/{id}")
//    public ResponseEntity<Category> updateCat (@RequestBody Category category) {
//        Category categoryEdit = categoryService.saveOrUpdate(category);
//        return new ResponseEntity<>(categoryEdit, HttpStatus.OK);
//    }

    // Không cần gửi kèm id khi sửa
    @PutMapping("/category/{id}")
    public ResponseEntity<Category> updateCat (@PathVariable("id") Long id, @RequestBody Category category) {
        Category categoryFind = categoryService.findById(id);
        categoryFind.setCategoryName(category.getCategoryName());
        categoryFind.setStatus(category.isStatus());

        Category categoryEdit = categoryService.saveOrUpdate(categoryFind);
        return new ResponseEntity<>(categoryEdit, HttpStatus.OK);
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<?> deleteCat (@PathVariable ("id") Long id) {
        if (categoryService.findById(id) != null) {
            categoryService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>("mess: Không tìm thấy", HttpStatus.NOT_FOUND);
    }


}
