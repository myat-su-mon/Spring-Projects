package com.example.demo.controller;

import com.example.demo.ds.Address;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Example12HttpEntity {

    // curl -X POST -H 'Content-Type: application/json' -d '{"firstName":"John", "lastName":"Doe", "streetAddress":"455 Larkspur Dr. Apt23", "city":"Baviera", "stateCode":"CA", "zipCode":"92908", "country":"United States"}' localhost:8080/actionL
    @RequestMapping("/actionL")
    @ResponseBody
    public String actionL(HttpEntity<Address> httpEntity){
        return String.format(
                "Received request from host = [%s], \n Address = [%s] \n",
                httpEntity.getHeaders().getHost(),
                httpEntity.getBody()
        );
    }
}
