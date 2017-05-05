package com.greenfox.foxclub.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Food {
  private List<String> foodList;

  public List<String> getFoodList() {
    foodList = Arrays.asList("Pizza", "Apple", "Hamburger", "Beans");
    return foodList;
  }
}

