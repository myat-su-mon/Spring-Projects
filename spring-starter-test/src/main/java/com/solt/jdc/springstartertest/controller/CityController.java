package com.solt.jdc.springstartertest.controller;

import com.solt.jdc.springstartertest.dao.CityDao;
import com.solt.jdc.springstartertest.ds.Cities;
import com.solt.jdc.springstartertest.ds.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    private final CityDao cityDao;

    public CityController(CityDao cityDao){
        this.cityDao = cityDao;
    }

    @GetMapping("/cities")
    public Cities getCities(){
        return new Cities(cityDao.findAll());
    }

    @PutMapping("/cities")
    public void putCity(@RequestBody City city){
        cityDao.save(city);
    }
}
