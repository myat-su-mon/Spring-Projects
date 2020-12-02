package com.example.returntypeofcontrollermethods.controller;

import com.example.returntypeofcontrollermethods.ds.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Example08ModelAndView {

    @GetMapping("/example08A")
    public ModelAndView example08A(){
        return new ModelAndView(
               "person-display",
                "person",
                new Person("John", "Doe")
        );
    }
}
