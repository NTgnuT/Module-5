package com.ra.session3.controller;

import com.ra.session3.model.entity.Category;
import com.ra.session3.model.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/category")
    public String category (Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "category/index";
    }

    @GetMapping("/add_category")
    public String addCat (Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "category/add";
    }

    @PostMapping("/add_category")
    public String createCat (@ModelAttribute("category") Category category) {
        if (categoryService.saveOrUpdate(category) != null) {
            return "redirect:/category";
        }
        return "category/add";
    }

    @GetMapping("/edit_category/{id}")
    public String editCat (@PathVariable("id") Category category, Model model) {
//        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "category/edit";
    }

    @PostMapping("/edit_category")
    public String updateCat (@ModelAttribute("category") Category category) {
        if (categoryService.saveOrUpdate(category) != null) {
            return "redirect:/category";
        }
        return "category/edit";
    }

}
