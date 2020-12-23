package com.example.businesslogicserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    // first: curl -H "username:john" -H "password:12345" http://localhost:9090/login
    // check otp database
    // second: curl -v -H "username:john" -H "code:2418" http://localhost:9090/login
    // third with token: curl -H "Authorization:tokenno.dkjggjfjgo.iorjgrpndfjd" http://localhost:9090/test
    @GetMapping("/test")
    public String test(){
        return "Test";
    }
}
