package com.greenfox.foxclub.model;


import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Drink {

  private List<String> drinkList;

  public List<String> getDrinkList() {
    drinkList = Arrays.asList("Water", "Juice", "Beer", "Vodka");
    return drinkList;
  }
}