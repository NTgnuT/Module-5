package com.ra.model.sevice;

import com.ra.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll ();
    Boolean createCat (Category category);
    Boolean updateCat (Category category);
    void delete (Integer id);
    Category findCatById(Integer Id);
}
