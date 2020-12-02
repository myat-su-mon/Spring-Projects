package com.example.pathvariablerequestparam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class IndexController {

    // curl localhost:8080/actionA/cities/Ygn
    @GetMapping("/actionA/cities/{city}")
    public String cityByCode(@PathVariable("city")String city){
        return String.format("Retrieved city = [%s]\n" , city);
    }

    // curl localhost:8080/actionB/countries/Myanmar/cities/Ygn
    @GetMapping("/actionB/countries/{country}/cities/{city}")
    public String countryAndCityByCode(@PathVariable("country") String country, @PathVariable(value = "city") String city){
        return String.format("Retrieved country = [%s], city = [%s]" , country, city);
    }

    // curl localhost:8080/actionC/countries/Myanmar/cities/Ygn
    // curl localhost:8080/actionC/countries/Myanmar
    @GetMapping({"/actionC/countries/{country}/cities/{city}", "actionC/countries/{country}"})
    public String countryAndOptionalCityByCodeJava8(@PathVariable("country") String country,
                                                    @PathVariable(value = "city") Optional<String> city){
        return String.format("Retrieved name = [%s], city = [%s]", country, city.orElse("Mdy"));
    }

    // curl localhost:8080/actionD/countries/Myanmar/cities/Ygn
    // curl localhost:8080/actionD/countries/Myanmar
    @GetMapping({"/actionD/countries/{country}/cities/{city}", "/actionD/countries/{country}"})
    public String countryAndOptionalCityByCode(@PathVariable("country") String country,
    @PathVariable(value = "city", required = false) String city){
        return String.format("Retrieved name = [%s], city = [%s]", country, city);
    }

    // curl localhost:8080/actionE/countries/US/cities/NY/zip/11111
    @GetMapping("/actionE/countries/{country}/cities/{city}/zip/{code}")
    public String actionE(@PathVariable Map<String, String> parameters){
        String parametersAsString = parameters.entrySet().stream()
                .map(entry -> String.format("[%s] -> [%s]", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(","));
        return String.format("Retrieved parameters as map = [%s]", parametersAsString);
    }

    // curl localhost:8080/actionF/countries/US,PL,UK,TW
    @GetMapping("/actionF/countries/{countries}")
    public String actionF(@PathVariable("countries") List<String> countries){
        return String.format("Retrieved cities identifiers = [%s] \n" , String.join(",", countries));
    }

}
