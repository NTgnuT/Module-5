<<<<<<< HEAD
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
=======
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
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e
