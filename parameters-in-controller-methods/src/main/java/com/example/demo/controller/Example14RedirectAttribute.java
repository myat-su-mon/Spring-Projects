package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Example14RedirectAttribute {

    // curl localhost:8080/actionN1
    @GetMapping("/actionN1")
    public String actionN1(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("firstName", "John");
        redirectAttributes.addFlashAttribute("lastName", "Doe");
        redirectAttributes.addFlashAttribute("city", "Los Angeles");
        return "redirect:/actionN2";
    }

    @GetMapping("/actionN2")
    public String actionN2(@RequestParam("firstName") String firstName, @ModelAttribute("lastName") String lastName,
                           @ModelAttribute("city") String city, Model model){
        model.addAttribute("firstName", firstName);
        // lastName and city are already in model, they do not have to be added.
        return "list-attributes";
    }
}
