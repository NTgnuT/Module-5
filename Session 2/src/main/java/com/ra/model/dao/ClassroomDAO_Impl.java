package com.ra.model.dao;

import com.ra.model.entity.Classroom;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ClassroomDAO_Impl implements ClassroomDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Classroom> findAll() {
        Session session = sessionFactory.openSession();
        List<Classroom> classrooms = new ArrayList<>();
        try {
            classrooms = session.createQuery("from Classroom ", Classroom.class).list();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return classrooms;
    }

    @Override
    public boolean saveClass(Classroom classroom) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(classroom);
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
    public boolean updateClass(Classroom classroom) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(classroom);
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
    public Classroom findById(Integer id) {
        Session session = sessionFactory.openSession();
        try {
            return session.get(Classroom.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public void deleteClass(Integer id) {
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
