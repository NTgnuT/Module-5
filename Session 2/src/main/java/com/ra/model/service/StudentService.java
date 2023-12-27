package com.ra.model.service;

import com.ra.model.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll ();
    boolean saveStu (Student student);
    boolean updateStu (Student student);
    Student findById (Integer id);
    void deleteStu (Integer id);
}
