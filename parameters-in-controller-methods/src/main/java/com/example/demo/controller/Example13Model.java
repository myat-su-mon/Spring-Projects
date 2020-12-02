package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class Example13Model {

    // curl localhost:8080/actionM1
    @GetMapping("/actionM1")
    public String actionM1(Map<String, String> model){
        model.put("firstName", "John");
        model.put("lastName", "Doe");
        model.put("email", "john@gmail.com");
        model.put("city", "Los Angeles");
        return "address";
    }

    // curl localhost:8080/actionM2
    @GetMapping("/actionM2")
    public String actionM2(Model model){
        model.addAttribute("firstName", "John");
        model.addAttribute("lastName", "Doe");
        model.addAttribute("email", "john@email.com");
        model.addAttribute("city", "Los Angeles");
        return "address";
    }

    // curl localhost:8080/actionM3
    @GetMapping("/actionM3")
    public String actionM3(ModelMap model){
        model.addAttribute("firstName", "John");
        model.addAttribute("lastName", "Doe");
        model.addAttribute("email", "john@email.com");
        model.addAttribute("city", "Los Angeles");
        return "address";
    }
}
