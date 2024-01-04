<<<<<<< HEAD
package com.ra.model.service;

import com.ra.model.dao.ClassroomDAO;
import com.ra.model.entity.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassroomService_Impl implements ClassroomService{
    @Autowired
    private ClassroomDAO classroomDAO;
    @Override
    public List<Classroom> findAll() {
        return classroomDAO.findAll();
    }

    @Override
    public boolean saveClass(Classroom classroom) {
        return classroomDAO.saveClass(classroom);
    }

    @Override
    public boolean updateClass(Classroom classroom) {
        return classroomDAO.updateClass(classroom);
    }

    @Override
    public Classroom findById(Integer id) {
        return classroomDAO.findById(id);
    }

    @Override
    public void deleteClass(Integer id) {
        classroomDAO.deleteClass(id);
    }
}
=======
package com.ra.model.service;

import com.ra.model.dao.ClassroomDAO;
import com.ra.model.entity.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassroomService_Impl implements ClassroomService{
    @Autowired
    private ClassroomDAO classroomDAO;
    @Override
    public List<Classroom> findAll() {
        return classroomDAO.findAll();
    }

    @Override
    public boolean saveClass(Classroom classroom) {
        return classroomDAO.saveClass(classroom);
    }

    @Override
    public boolean updateClass(Classroom classroom) {
        return classroomDAO.updateClass(classroom);
    }

    @Override
    public Classroom findById(Integer id) {
        return classroomDAO.findById(id);
    }

    @Override
    public void deleteClass(Integer id) {
        classroomDAO.deleteClass(id);
    }
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e
