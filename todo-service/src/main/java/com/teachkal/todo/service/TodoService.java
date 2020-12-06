package com.teachkal.todo.service;

import com.teachkal.todo.entity.Todo;
import com.teachkal.todo.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo saveTodo(Todo todo) {
        log.info("Inside saveTodo method inside of TodoRepository");
        return todoRepository.save(todo);
    }

    public Todo findTodoById(Long todoId) {
        log.info("Inside findTodoById method inside of TodoRepository");
        return todoRepository.findTodoById(todoId);
    }
}
