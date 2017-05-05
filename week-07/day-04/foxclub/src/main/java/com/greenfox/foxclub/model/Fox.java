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
  List<String> knownListOfTricks;

  public Fox(){
    currentFood = "no food";
    currentDrink = "no drink";
    knownListOfTricks = new ArrayList<>();
  }

  public void setCurrentFood(String currentFood) {
    this.currentFood = currentFood;
  }

  public void setCurrentDrink(String currentDrink) {
    this.currentDrink = currentDrink;
  }

  public void addTrickToKnownTrickList(String trick){
    knownListOfTricks.add(trick);
  }
}
