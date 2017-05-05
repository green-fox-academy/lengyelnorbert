package com.greenfox.foxclub.controller;


import com.greenfox.foxclub.model.Drink;
import com.greenfox.foxclub.model.Food;
import com.greenfox.foxclub.model.Fox;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

  @Autowired
  ModelAndViewFactory modelAndViewFactory;

  @Autowired
  Fox fox;

  @Autowired
  Food food;

  @Autowired
  Drink drink;


  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("index");
    m.addObject("fox", fox);
    return m;
  }

  @RequestMapping("/tricks")
  public ModelAndView tricks() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("tricks");
    m.addObject("fox", fox);
    return m;
  }

  @RequestMapping("/shop")
  public ModelAndView shop() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("shop");
    m.addObject("foodList", food.getFoodList());
    m.addObject("drinkList", drink.getDrinkList());
    m.addObject("fox", fox);
    return m;
  }
}
