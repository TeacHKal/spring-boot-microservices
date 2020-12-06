package com.teachkal.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "user-service is not working at the moment.";
    }

    @GetMapping("/todoServiceFallBack")
    public String todoServiceFallBackMethod() {
        return "todo-Service is not working at the moment.";
    }
}
