package com.example.filterdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // curl http://localhost:8080/hello
    // curl -v http://localhost:8080/hello
    // curl -v -H "Request-Id:12345" http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
