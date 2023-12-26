package com.ra.controller;

import com.ra.model.entity.Category;
import com.ra.model.sevice.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/")
    public String index(Model model) {
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute("categoryList", categoryList);
        return "home";
    }

    @GetMapping("/add")
    public String addCat (Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "add";
    }

    @PostMapping("/add")
    public String createCat (@ModelAttribute("category") Category category) {
        if (categoryService.createCat(category)) {
            return "redirect:/";
        }
        return "add";
    }

    @GetMapping("/edit/{id}")
    public String editCat (@PathVariable("id") Integer id, Model model) {
        Category category = categoryService.findCatById(id);
        model.addAttribute("category", category);
        return "edit";
    }

    @PostMapping("/edit")
    public String updateCat (@ModelAttribute("category")Category category) {
        if (categoryService.updateCat(category)) {
            return "redirect:/";
        }
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteCat (@PathVariable("id") Integer id) {
        categoryService.delete(id);
        return "redirect:/";
    }

}

