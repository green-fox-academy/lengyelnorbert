package com.greenfoxacademy.colorbean.config;


import com.greenfoxacademy.colorbean.elements.BlueBean;
import com.greenfoxacademy.colorbean.elements.GreenBean;
import com.greenfoxacademy.colorbean.elements.RedBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorBeanConfig {

  @Bean
  public RedBean redBean(){
    return new RedBean();
  }

  @Bean
  public BlueBean blueBean(){
    return new BlueBean();
  }

  @Bean
  public GreenBean greenBean(){
    return new GreenBean();
  }
}
