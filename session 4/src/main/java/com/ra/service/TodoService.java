<<<<<<< HEAD
package com.ra.service;

import com.ra.model.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> findAll();
    Todo saveOrUpdate(Todo todo);
    Todo findById(int id);
    void delete(int id);
}
=======
package com.ra.service;

import com.ra.model.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> findAll();
    Todo saveOrUpdate(Todo todo);
    Todo findById(int id);
    void delete(int id);
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e
