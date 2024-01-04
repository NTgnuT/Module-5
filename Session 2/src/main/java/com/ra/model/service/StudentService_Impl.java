package com.ra.model.service;

import com.ra.model.dao.StudentDAO;
import com.ra.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService_Impl implements StudentService{
    @Autowired
    private StudentDAO studentDAO;
    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public boolean saveStu(Student student) {
        return studentDAO.saveStu(student);
    }

    @Override
    public boolean updateStu(Student student) {
        return studentDAO.updateStu(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentDAO.findById(id);
    }

    @Override
    public void deleteStu(Integer id) {
        studentDAO.deleteStu(id);
    }
}
