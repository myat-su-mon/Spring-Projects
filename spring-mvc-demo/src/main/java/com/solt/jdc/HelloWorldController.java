package com.solt.jdc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
//    @GetMapping("/")
    public String helloWorld(Model model){
        model.addAttribute("tagline", "Hello Spring MVC");
        return "hello";
    }
}
