package com.example.securitytest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // curl http://localhost:8080/hello
    // curl -u user:aea2e7e6-e1e7-4075-9049-bdc0af27ba3c http:://localhost:8080/hello
    // curl -D - http://localhost:8080/hello
    // curl -D - http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Security";
    }
}
