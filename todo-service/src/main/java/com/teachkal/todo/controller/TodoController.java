package com.teachkal.todo.controller;

import com.teachkal.todo.entity.Todo;
import com.teachkal.todo.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
@Slf4j
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("")
    public Todo saveTodo(@RequestBody Todo todo){
        log.info("Inside saveTodo method inside of TodoController");
        return todoService.saveTodo(todo);
    }

    @GetMapping("/{id}")
    public Todo findTodoById(@PathVariable("id") Long todoId) {
        log.info("Inside findTodoById method inside of TodoController");
        return todoService.findTodoById(todoId);
    }
}
