package com.example.filterdemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // curl -v http://localhost:8080/hello
    // curl -H "Authorization:SD9cICjl1e" http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
