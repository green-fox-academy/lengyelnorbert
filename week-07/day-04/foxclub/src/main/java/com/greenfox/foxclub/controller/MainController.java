package com.greenfox.foxclub.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


  @RequestMapping("/")
  public String bankAccount() {
    return "index";
  }
}
