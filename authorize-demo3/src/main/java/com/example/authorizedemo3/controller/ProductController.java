package com.example.authorizedemo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    // curl http://localhost:8080/product/1234
    @GetMapping("/product/{code}")
    public String productOne(@PathVariable String code){
        return code;
    }
}
