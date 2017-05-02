package com.greenfoxacademy.springstart.controllers;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name) {
    long counterHere = counter.incrementAndGet();
    Greeting newGreeting = new Greeting(counterHere, name);
    return newGreeting;
  }
}
