package com.ra.session3.model.service;

import com.ra.session3.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category saveOrUpdate(Category category);
    Category findById (Integer id);
    void delete(Integer id);
}
