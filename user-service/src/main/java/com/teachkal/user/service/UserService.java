package com.teachkal.user.service;

import com.teachkal.user.VO.ResponseTemplateVO;
import com.teachkal.user.VO.Todo;
import com.teachkal.user.entity.User;
import com.teachkal.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser method inside of UserService");
        return userRepository.save(user);
    }


    public ResponseTemplateVO getUserWithTodo(Long userId) {
        log.info("Inside getUserWithTodo method inside of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user =  userRepository.findByUserId(userId);

        Todo todo = restTemplate.getForObject("http://TODO-SERVICE/todos/" + user.getTodoId(), Todo.class);

        vo.setUser(user);
        vo.setTodo(todo);

        return vo;
    }
}
