package com.solt.jdc.springstartertest;

import com.solt.jdc.springstartertest.controller.CityController;
import com.solt.jdc.springstartertest.ds.City;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityControllerSpringBootTest {

    @Autowired
    private CityController cityController;

    @Test
    public void shouldSaveFewCities(){
        cityController.putCity(City.builder().name("Ygn").build());
        cityController.putCity(City.builder().name("Mdy").build());
        cityController.putCity(City.builder().name("Thanlyin").build());

        assertThat(cityController.getCities().getCities()).containsOnly(
                new City(1, "Ygn"),
                new City(2, "Mdy"),
                new City(3, "Thanlyin")
        );

    }
}
