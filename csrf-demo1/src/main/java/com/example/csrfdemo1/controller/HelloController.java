package com.example.csrfdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // curl -v http://localhost:8080/hello
    @GetMapping("/hello")
    public String getHello(){
        return "Get Hello!";
    }

    // curl -X POST http://localhost:8080/hello
    // curl -v -X POST http://localhost:8080/hello
    // curl -X POST http://localhost:8080/hello -H 'Cookie: JSESSIONID=6AF44B3CFF4E938B63042F00F860770C' -H 'X-CSRF-TOKEN: 62f73186-ce6a-4c69-95f3-153922ae36d8'
    @PostMapping("/hello")
    public String postHello(){
        return "Post Hello!";
    }
}
