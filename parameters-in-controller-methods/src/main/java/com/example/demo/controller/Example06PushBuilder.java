package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.PushBuilder;

@Controller
public class Example06PushBuilder {

    // http://localhost:8080/actionF/no-push
    @GetMapping("/actionF/no-push")
    public String actionFNoPush(){
        return "images";
    }

    // https://localhost:8443/actionF/with-push
    @GetMapping("/actionF/with-push")
    public String actionFWithPush(PushBuilder pushBuilder){
        if (pushBuilder != null){
            pushBuilder.path("/img/01.jpg").push();
            pushBuilder.path("/img/02.jpg").push();
            pushBuilder.path("/img/03.jpg").push();
        }
        return "images";
    }
}
