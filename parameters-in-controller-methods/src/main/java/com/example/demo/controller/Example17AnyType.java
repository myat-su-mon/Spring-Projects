package com.example.demo.controller;

import com.example.demo.ds.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Example17AnyType {

    // curl "http://localhost:8080/actionQ?firstName=John&lastName=Doe"
    @GetMapping("/actionQ")
    @ResponseBody
    public String actionQ(String firstName, String lastName){
        return String.format("firstName = [%s], lastName= [%s] \n", firstName, lastName);
    }

    @GetMapping("/actionQ/simpleForm")
    public String actionQSimpleForm(Person person){
        return "person-form-simple";
    }

    @PostMapping("/actionQ/simpleForm")
    public String actionQSimpleFormSubmit(Person person){
        return "person-display-simple";
    }
}
