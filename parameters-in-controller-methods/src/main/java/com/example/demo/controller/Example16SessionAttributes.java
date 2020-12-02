package com.example.demo.controller;

import com.example.demo.dao.AddressDao;
import com.example.demo.ds.Address;
import com.example.demo.ds.Country;
import com.example.demo.ds.Person;
import com.example.demo.ds.ShortAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Controller
@SessionAttributes({"person", "shortAddress", "country"})
public class Example16SessionAttributes {

    @Autowired
    private AddressDao addressDao;

    @GetMapping("/actionP")
    public String actionP(Model model){
        model.addAttribute("addresses", addressDao.findAll());
        return "address-list";
    }

    @GetMapping("/actionP/address/step1")
    public String actionPStep1(@ModelAttribute("person") Person person){
        return "address-form-step1";
    }

    @PostMapping("/actionP/address/step1")
    public String actionPStep1(@ModelAttribute("person") @Valid Person person, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "address-form-step1";
        } else {
            return "redirect:/actionP/address/step2";
        }
    }

    @GetMapping("/actionP/address/step2")
    public String actionPStep2(@ModelAttribute("shortAddress") ShortAddress shortAddress){
        return "address-form-step2";
    }

    @PostMapping("/actionP/address/step2")
    public String actionPStep2(@ModelAttribute("shortAddress") @Valid ShortAddress shortAddress, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "address-form-step2";
        } else {
            return "redirect:/actionP/address/step3";
        }
    }

    @GetMapping("/actionP/address/step3")
    public String actionPStep3(@ModelAttribute("country") Country country){
        return "address-form-step3";
    }

    @PostMapping("/actionP/address/step3")
    public String actionPStep3(@ModelAttribute("country") @Valid Country country, BindingResult bindingResult,
                               @ModelAttribute("person") Person person, @ModelAttribute("shortAddress") ShortAddress shortAddress,
                               SessionStatus sessionStatus){
        if (bindingResult.hasErrors()){
            return "address-form-step3";
        } else {
            Address address = new Address(person, shortAddress, country);
            addressDao.save(address);
            sessionStatus.setComplete();
            return "redirect:/actionP";
        }
    }

    @ModelAttribute("person")
    public Person person(){
        return new Person();
    }

    @ModelAttribute("shortAddress")
    public ShortAddress shortAddress(){
        return new ShortAddress();
    }

    @ModelAttribute("country")
    public Country country(){
        return new Country();
    }
}
