package com.example.demo;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestHello {

    private MockMvc mockMvc;

    @InjectMocks
    private HelloResource helloResource;

    @Before
    public void setUp() throws Exception{

        mockMvc = MockMvcBuilders.standaloneSetup(helloResource)
                .build();

    }
    @Test
    public void testHelloWorld() throws Exception{
        mockMvc.perform(
        get("/hello")
        )
            .andExpect(status().isOk())
                .andExpect(content().string("hello World"));
    }

    @Test
    public void testHelloWorldJson() throws Exception {
        mockMvc.perform(get("/hello/json"))

                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", Matchers.is("Greetings")))
                .andExpect(jsonPath("$.value",Matchers.is("Hello World")))
                .andExpect(jsonPath("$.*",Matchers.hasSize(2)));
    }




}
