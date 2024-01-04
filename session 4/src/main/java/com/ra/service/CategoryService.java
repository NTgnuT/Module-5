package com.ra.service;

import com.ra.model.dto.reponse.CategoryResponse;
import com.ra.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    // Phân trang trả về DTO
    Page<CategoryResponse> getAll(Pageable pageable);

    List<Category> findAll();
    Category saveOrUpdate(Category category);
    Category findById (Long id);
    void delete(Long id);

    Page<CategoryResponse> searchByName (Pageable pageable, String name);
}
