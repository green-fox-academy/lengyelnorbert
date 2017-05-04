package com.greenfoxacademy.colorbean;

import com.greenfoxacademy.colorbean.config.ColorBeanConfig;
import com.greenfoxacademy.colorbean.elements.BlueBean;
import com.greenfoxacademy.colorbean.elements.GreenBean;
import com.greenfoxacademy.colorbean.elements.RedBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorbeanApplication {

  public static void main(String[] args) {

    SpringApplication.run(ColorbeanApplication.class, args);

    AnnotationConfigApplicationContext beanColors = new AnnotationConfigApplicationContext(
            ColorBeanConfig.class);

    RedBean redBean = beanColors.getBean(RedBean.class);
    redBean.printColor();
    GreenBean greenBean = beanColors.getBean(GreenBean.class);
    greenBean.printColor();
    BlueBean blueBean = beanColors.getBean(BlueBean.class);
    blueBean.printColor();
  }
}
