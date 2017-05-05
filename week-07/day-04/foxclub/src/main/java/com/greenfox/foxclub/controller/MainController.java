package com.greenfox.foxclub.controller;


import com.greenfox.foxclub.model.Drink;
import com.greenfox.foxclub.model.Food;
import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.model.Trick;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  @Autowired
  Trick trick;


  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("index");
    m.addObject("fox", fox);
    m.addObject("knownTrickList", fox.getKnownListOfTricks());
    return m;
  }

  @RequestMapping("/tricks")
  public ModelAndView tricks() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("tricks");
    m.addObject("trickList", trick.getTrickList());
    m.addObject("knownTrickList", fox.getKnownListOfTricks());
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

  @RequestMapping("/eatdrink")
  public String eatDrink(@RequestParam(value = "eatenFood") String eatenFood,
          @RequestParam(value = "drunkDrink") String drunkDrink) {
    fox.setCurrentFood(eatenFood);
    fox.setCurrentDrink(drunkDrink);
    return "redirect:/";
  }

  @RequestMapping("/trickslearned")
  public String tricks(@RequestParam(value = "trickToLearn") int trickLearned) {
    String tempTrick = trick.getTrickList().get(trickLearned);
    trick.getTrickList().remove(trickLearned);
    fox.addTrickToKnownTrickList(tempTrick);
    return "redirect:/";
  }
}
