package com.ra.model.dao;

import com.ra.model.entity.Classroom;
import com.ra.model.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> findAll ();
    boolean saveStu (Student student);
    boolean updateStu (Student student);
    Student findById (Integer id);
    void deleteStu (Integer id);
}
