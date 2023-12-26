package com.ra.model.sevice;

import com.ra.model.dao.CategoryDAO;
import com.ra.model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService_Impl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;
    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

    @Override
    public Boolean createCat(Category category) {
        return categoryDAO.createCat(category);
    }

    @Override
    public Boolean updateCat(Category category) {
        return categoryDAO.updateCat(category);
    }

    @Override
    public void delete(Integer id) {
        categoryDAO.delete(id);
    }

    @Override
    public Category findCatById(Integer Id) {
        return categoryDAO.findCatById(Id);
    }
}
