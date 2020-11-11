package com.solt.jdc.springboottestsimple;

import com.solt.jdc.springboottestsimple.service.NameService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SpringBootTestSimpleApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private NameService nameService;

    @Test
    public void should_say_hello() throws Exception {
        Mockito.when(nameService.getName()).thenReturn("Test");
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/")).andReturn();
        Assert.assertEquals("Hello Test", mvcResult.getResponse().getContentAsString());
    }

}
