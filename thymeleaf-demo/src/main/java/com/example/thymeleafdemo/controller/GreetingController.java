package com.example.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

    @GetMapping("/{name}")
    public String greet(@PathVariable String name, Model model){
        String greet = "Hello" + name;
        model.addAttribute("tagline", greet);
        return "pages/greet";
    }

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("tagline", "Hello Spring MVC");
        return "pages/greet";
    }
}
