package com.example.filterdemo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // curl -v http://localhost:8080/hello
    // curl -H "Request-Id:12345" http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
