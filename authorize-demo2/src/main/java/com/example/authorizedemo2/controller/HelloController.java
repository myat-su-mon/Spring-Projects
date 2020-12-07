package com.example.authorizedemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // curl -u john:12345 http://localhost:8080/hello
    // curl -u jane:12345 http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }

    // curl -u john:12345 http://localhost:8080/ciao
    // curl -u jane:12345 http://localhost:8080/ciao
    @GetMapping("/ciao")
    public String ciao(){
        return "Ciao!";
    }

    // curl -u john:12345 http://localhost:8080/hola
    // curl -u jane:12345 http://localhost:8080/hola
    // curl http://localhost:8080/hola
    @GetMapping("/hola")
    public String hola(){
        return "Hola!";
    }
}
