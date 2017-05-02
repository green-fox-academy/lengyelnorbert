package com.greenfoxacademy.springstart.controllers;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
  AtomicLong counterWeb = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam(value = "name", defaultValue = "World")String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counterWeb.incrementAndGet());
    return "greeting";
  }
}
