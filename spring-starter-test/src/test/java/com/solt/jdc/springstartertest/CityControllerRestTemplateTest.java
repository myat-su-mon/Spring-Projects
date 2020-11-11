package com.solt.jdc.springstartertest;

import com.solt.jdc.springstartertest.ds.Cities;
import com.solt.jdc.springstartertest.ds.City;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CityControllerRestTemplateTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldSaveCities(){
        String url = String.format("http://localhost:%d/cities", port);
        testRestTemplate.put(url, City.builder().name("Los Angeles").build());
        testRestTemplate.put(url, City.builder().name("New York").build());

        Cities cities = testRestTemplate.getForEntity("/cities", Cities.class).getBody();

        Assertions.assertThat(cities.getCities())
                .containsOnly(
                        new City(1, "Los Angeles"),
                        new City(2, "New York")
                );
    }
}
