package com.greenfoxacademy.hellobean;

import com.greenfoxacademy.hellobean.config.HelloWorldConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanApplication {

  public static void main(String[] args) {
    SpringApplication.run(HellobeanApplication.class, args);

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

    HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
    helloWorld.setMessage("Hello World");
    helloWorld.getMessage();
  }
}
