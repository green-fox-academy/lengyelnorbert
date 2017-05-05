package com.greenfox.foxclub.model;


import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Fox {
  String profilePictureLocation = "pictures/greenfox.png";
  String name;
  String currentFood;
  String currentDrink;
  List<String> listOfTricks;

  public Fox(){
    currentFood = "no food";
    currentDrink = "no drink";
    listOfTricks = new ArrayList<>();
  }
}
