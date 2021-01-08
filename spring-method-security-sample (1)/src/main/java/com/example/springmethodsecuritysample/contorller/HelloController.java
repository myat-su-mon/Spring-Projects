package com.example.springmethodsecuritysample.contorller;


import com.example.springmethodsecuritysample.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private NameService nameService;

    //curl -u emma:12345 http://localhost:8080/hello
    //curl -u natalie:12345 http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello "+ nameService.getName();
    }
    //curl -u emma:12345 http://localhost:8080/secret/names/emma
    //curl -u emma:12345 http://localhost:8080/secret/names/natalie --forbidden
    //curl -u natalie:12345 http://localhost:8080/secret/names/natalie
    @GetMapping("/secret/names/{name}")
    public List<String> names(@PathVariable String name){
        return nameService.getSecretName(name);
    }
}
