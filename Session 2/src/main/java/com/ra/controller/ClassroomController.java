package com.ra.controller;

import com.ra.model.entity.Classroom;
import com.ra.model.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClassroomController {
    @Autowired
    private ClassroomService classroomService;
    @RequestMapping("/")
    public String home(Model model) {
        List<Classroom> classrooms = classroomService.findAll();
        model.addAttribute("classrooms", classrooms);
        return "home";
    }

    @GetMapping("/add_class")
    public String addClass(Model model) {
        Classroom classroom = new Classroom();
        model.addAttribute("classroom", classroom);
        return "add-class";
    }

    @PostMapping("/add_class")
    public String createClass(@ModelAttribute("classroom")Classroom classroom) {
        if (classroomService.saveClass(classroom)) {
            return "redirect:/";
        }
        return "add-class";
    }
}
