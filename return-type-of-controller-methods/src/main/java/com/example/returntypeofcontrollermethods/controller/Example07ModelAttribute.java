package com.example.returntypeofcontrollermethods.controller;

import com.example.returntypeofcontrollermethods.ds.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Example07ModelAttribute {

    @GetMapping("example07A")
    @ModelAttribute
    public Person example07A(){
        return new Person("John", "Doe");
    }
}
