package com.example.returntypeofcontrollermethods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class Example06Model {

    // curl -d '{"firstName":"John", "lastName":"Doe"}' -H 'Content-Type: application/json' http://localhost:8080/example06A
    @GetMapping("example06A")
    public Model example06A(){
        Model model = new BindingAwareModelMap();
        model.addAttribute("names", List.of("John", "Marry", "William", "James"));
        model.addAttribute("cities", List.of("New York", "Tokyo", "Sydney", "Bangkok"));
        return model;
    }

    @GetMapping("example06B")
    public Map example06B(){
        return Map.of("names", List.of("John", "Marry", "William", "James"),
                "cities", List.of("New York", "Tokyo", "Sydney", "Bangkok"));
    }
}
