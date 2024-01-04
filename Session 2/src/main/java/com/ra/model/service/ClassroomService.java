<<<<<<< HEAD
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
=======
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
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e
