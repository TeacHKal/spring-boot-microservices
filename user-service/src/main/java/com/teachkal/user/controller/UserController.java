package com.teachkal.user.controller;

import com.teachkal.user.VO.ResponseTemplateVO;
import com.teachkal.user.entity.User;
import com.teachkal.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser method inside of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithTodo(@PathVariable("id") Long userId){
        log.info("Inside getUserWithTodo method inside of UserController");
        return userService.getUserWithTodo(userId);
    }
}
