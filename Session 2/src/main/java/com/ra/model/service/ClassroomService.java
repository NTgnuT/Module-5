package com.ra.model.service;

import com.ra.model.entity.Classroom;

import java.util.List;

public interface ClassroomService {
    List<Classroom> findAll ();
    boolean saveClass (Classroom classroom);
    boolean updateClass (Classroom classroom);
    Classroom findById (Integer id);
    void deleteClass (Integer id);
}
