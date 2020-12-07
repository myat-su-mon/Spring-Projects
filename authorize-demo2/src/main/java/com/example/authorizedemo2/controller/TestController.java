package com.example.authorizedemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // curl -XGET http://localhost:8080/a
    // curl -u john:12345 -XGET http://localhost:8080/a
    @GetMapping("/a")
    public String getEndPointA(){
        return "Works!";
    }

    // curl -XPOST http://localhost:8080/a
    @PostMapping("/a")
    public String postEndPointA(){
        return "Works!";
    }

    // curl -u john:12345 -XGET http://localhost:8080/a/b
    // curl http://localhost:8080/a/b
    @GetMapping("/a/b")
    public String getEndPointB(){
        return "Works!";
    }

    @GetMapping("/a/b/c")
    public String getEndPointC(){
        return "Works!";
    }
}
