package com.solt.jdc.springstartertest;

import com.solt.jdc.springstartertest.controller.CityController;
import com.solt.jdc.springstartertest.dao.CityDao;
import com.solt.jdc.springstartertest.ds.Cities;
import com.solt.jdc.springstartertest.ds.City;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CityController.class)
public class CityControllerSmallSpringBootTest {
    @Autowired
    private CityController cityController;

    @MockBean
    private CityDao cityDao;

    @Test
    public void shouldSaveFewCities() {
        cityController.putCity(City.builder().name("Los Angeles").build());
        cityController.putCity(City.builder().name("New York").build());
        cityController.putCity(City.builder().name("San Francisco").build());

        Mockito.verify(cityDao).save(new City(null, "Los Angeles"));
        Mockito.verify(cityDao).save(new City(null, "New York"));
        Mockito.verify(cityDao).save(new City(null, "San Francisco"));
    }

    @Test
    public void shouldFetchCities() {
        Mockito.when(cityDao.findAll())
                .thenReturn(Arrays.asList(
                        new City(1, "Los Angeles"),
                        new City(1, "New York")
                ));

        Cities fetchCities = cityController.getCities();
        Assertions.assertThat(fetchCities.getCities())
                .containsOnly(
                        new City(1, "Los Angeles"),
                        new City(1, "New York")
                );
    }
}
