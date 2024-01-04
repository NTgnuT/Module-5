<<<<<<< HEAD
package com.ra.session3.model.service;

import com.ra.session3.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category saveOrUpdate(Category category);
    Category findById (Integer id);
    void delete(Integer id);
}
=======
package com.ra.session3.model.service;

import com.ra.session3.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category saveOrUpdate(Category category);
    Category findById (Integer id);
    void delete(Integer id);
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e
