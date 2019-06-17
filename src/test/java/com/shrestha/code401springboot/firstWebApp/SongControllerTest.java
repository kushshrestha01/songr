package com.shrestha.code401springboot.firstWebApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class SongControllerTest {
    @Autowired
    SongController songController;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {}

    @Test
    public void testControllerAutoWired(){
        assertNotNull(songController);
    }


}