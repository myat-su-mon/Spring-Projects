package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class Example07Principal {

    // http://localhost:8080/actionG
    @GetMapping("/actionG")
    @ResponseBody
    public String actionG(Principal principal){
        return String.format("Authenticated with principal = [%s]\n", principal.getName());
    }
}
