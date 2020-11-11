package com.solt.jdc.springboottestsimple.controller;

import com.solt.jdc.springboottestsimple.service.NameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private final NameService nameService;

    public HelloController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello" + nameService.getName();
    }
}
