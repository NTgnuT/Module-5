package com.ra.model.dao;

import com.ra.model.entity.Classroom;
import com.ra.model.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentDAO_Impl implements StudentDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Student> findAll() {
        Session session = sessionFactory.openSession();
        List<Student> students = new ArrayList<>();
        try {
            students = session.createQuery("from Student ", Student.class).list();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return students;
    }

    @Override
    public boolean saveStu(Student student) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean updateStu(Student student) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public Student findById(Integer id) {
        Session session = sessionFactory.openSession();
        try {
            return session.get(Student.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public void deleteStu(Integer id) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(findById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }
}
