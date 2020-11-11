package com.solt.jdc.springstartertest;

import com.solt.jdc.springstartertest.controller.CityController;
import com.solt.jdc.springstartertest.dao.CityDao;
import com.solt.jdc.springstartertest.ds.City;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@WebMvcTest(CityController.class)
public class CityControllerMockMvcSingleTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CityDao cityDao;

    @Test
    public void shouldSaveCity() throws Exception{
        mvc.perform(
                MockMvcRequestBuilders.put("/cities")
                        .content("{\"name\":\"los Angeles\"}")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

        Mockito.verify(cityDao).save(new City(null, "Los Angeles"));
    }

    @Test
    public void shouldFetchCities() throws Exception{
        Mockito.when(cityDao.findAll())
                .thenReturn(Arrays.asList(
                        new City(1, "Los Angeles"),
                        new City(2, "New York")
                ));

        String jsonResponse = mvc.perform(MockMvcRequestBuilders.get("/cities"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();

        Assertions.assertThat(jsonResponse)
                .contains("{\"id\":1, \"name\":\"Los Angeles\"}")
                .contains("{\"id\":2, \"name\":\"New York\"}");
    }
}
