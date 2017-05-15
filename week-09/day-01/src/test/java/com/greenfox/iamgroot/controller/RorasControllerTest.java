package com.greenfox.iamgroot.controller;


import com.greenfox.iamgroot.IamgrootApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IamgrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RorasControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void roraFillShipFourtyPercent() throws Exception {
    mockMvc.perform(get("/rocket/fill").param("caliber", ".25").param("amount", "5000")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.received", is(".25")))
            .andExpect(jsonPath("$.amount", is(5000)))
            .andExpect(jsonPath("$.shipstatus", is("40%")))
            .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void roraFillShipFull() throws Exception {
    mockMvc.perform(get("/rocket/fill").param("caliber", ".50").param("amount", "12500")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.received", is(".50")))
            .andExpect(jsonPath("$.amount", is(12500)))
            .andExpect(jsonPath("$.shipstatus", is("full")))
            .andExpect(jsonPath("$.ready", is(true)));
  }

  @Test
  public void roraFill() {
  }
}
