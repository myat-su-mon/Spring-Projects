package com.example.corsdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String main(){
        return "main";
    }

    //@CrossOrigin
    @PostMapping("/test")
    @ResponseBody
    public String test(){
        logger.info("Test method called.");
        return "Hello";
    }
}
