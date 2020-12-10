package com.example.authorizedemo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    // curl http://localhost:8080/email/jane@gmail.com
    // curl http://localhost:8080/email/jane@gmail.net
    @GetMapping("/email/{email}")
    public String video(@PathVariable String email){
        return "Allowed for email" + email;
    }
}
