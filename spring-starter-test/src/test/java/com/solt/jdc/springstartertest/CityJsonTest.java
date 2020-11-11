package com.solt.jdc.springstartertest;

import com.solt.jdc.springstartertest.ds.City;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@JsonTest
public class CityJsonTest {

    @Autowired
    private JacksonTester<City> json;

    @Test
    public void shouldSerialize() throws IOException {
        City city = new City(1, "New York");
        String json = this.json.write(city).getJson();
        Assert.assertEquals(json, "{\"id\":1,\"name\":\"New York\"}");
    }

    public void shouldDeserialize() throws IOException {
        City city = json.parse("{\"id\":1,\"name\":\"New York\"}").getObject();
        Assert.assertEquals(Integer.valueOf(1), city.getId());
        Assert.assertEquals("New York", city.getName());
    }
}
