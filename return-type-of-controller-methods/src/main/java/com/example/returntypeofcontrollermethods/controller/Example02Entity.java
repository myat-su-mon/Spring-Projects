package com.example.returntypeofcontrollermethods.controller;

import com.example.returntypeofcontrollermethods.ds.Person;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example02Entity {

    // curl -D - http://localhost:8080/example02A
    @GetMapping("/example02A")
    public HttpEntity<Person> example02A(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Person-Version", "V2");
        return new HttpEntity<>(
                new Person("John", "Doe"),
                httpHeaders
        );
    }

    // curl -D - http://localhost:8080/example02B
    @GetMapping("/example02B")
    public ResponseEntity<Person> example02B(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Person-Version", "V2");
        return new ResponseEntity<>(
                new Person("John", "Doe"),
                httpHeaders,
                HttpStatus.FOUND
        );
    }
}
