package com.shrestha.code401springboot.firstWebApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class AlbumControllerTest {

    @Autowired
    AlbumController albumController;

    @Autowired
    HelloWorldController helloWorldController;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {}

    @Test
    public void testControllerIsAutoWired(){
        assertNotNull(helloWorldController);
    }

    @Test
    public void testRequestToRootGivesHelloWorld() throws Exception {
        mockMvc.perform(get("/")).andExpect(content().string(containsString("Hello, World!!!")));
    }

}