package com.example.authorizedemo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    // curl -u john:12345 http://localhost:8080/video/us/en
    @GetMapping("/video/{country}/{language}")
    public String video(@PathVariable String country, @PathVariable String language){
        return "Video allowed for " + country + " " + language;
    }
}
