package com.example.customcsrf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // curl -H "X-IDENTIFIER:12345" http://localhost:8080/hello
    @GetMapping("/hello")
    public String getHello() {
        return "Get Hello";
    }

    // curl -X POST http://localhost:8080/hello
    // curl -X POST -H "X-IDENTIFIER:12345" -H "X-CSRF-TOKEN:bd88bec7-4766-4eb2-8b1e-86983a4622b1" http://localhost:8080/hello
    @PostMapping("/hello")
    public String postHello() {
        return "Post Hello";
    }

    @PostMapping("/ciao")
    public String postCiao() {
        return "Post Ciao";
    }
}
