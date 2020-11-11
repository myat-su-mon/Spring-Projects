package com.example.actuatortag;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    private Random random = new Random();

    public String index(){
        if (random.nextInt() %4 < 1) {
            throw new IllegalArgumentException("Fail the request");
        }
        return "OK";
    }
}
