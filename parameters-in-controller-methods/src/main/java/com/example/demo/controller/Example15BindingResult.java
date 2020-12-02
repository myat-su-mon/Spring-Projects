package com.example.demo.controller;

import com.example.demo.ds.Address;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class Example15BindingResult {

    // http://localhost:8080/action1
    @GetMapping("/action1")
    public String action01(@ModelAttribute Address address){
        return "address-form";
    }

    // John Doe
    // 455 Larkspur Dr , Apt 23
    // NewYork CA 92908 United States
    @PostMapping("/action1")
    public String action1Submit(@ModelAttribute @Valid Address address,
                                BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "address-form";
        }
        // business rules - calling services
        redirectAttributes.addFlashAttribute(address);
        return "redirect:/action1/ok";
    }

    @GetMapping("/action1/ok")
    public String action1OK(@ModelAttribute Address address){
        return "address-form-ok";
    }
}
