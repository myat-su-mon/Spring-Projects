package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZoneId;
import java.util.TimeZone;

@Controller
public class Example10TimeZone {

    // curl localhost:8080/actionJ
    @RequestMapping("/actionJ")
    @ResponseBody
    public String actionJ(TimeZone timeZone, ZoneId zoneId){
        return String.format("TimeZone = [%s], ZoneId = [%s] \n", timeZone.getDisplayName(), zoneId.getId());
    }
}
