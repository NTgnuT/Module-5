<<<<<<< HEAD
package com.ra.service;

import com.ra.model.entity.Todo;
import com.ra.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo saveOrUpdate(Todo todo) {
        return todoRepository.save(todo);
    }


    @Override
    public Todo findById(int id) {
        return todoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        todoRepository.deleteById(id);
    }
}
=======
package com.ra.service;

import com.ra.model.entity.Todo;
import com.ra.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo saveOrUpdate(Todo todo) {
        return todoRepository.save(todo);
    }


    @Override
    public Todo findById(int id) {
        return todoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        todoRepository.deleteById(id);
    }
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e
