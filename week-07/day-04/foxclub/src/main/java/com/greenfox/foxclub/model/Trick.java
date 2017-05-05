package com.greenfox.foxclub.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Trick {

  private List<String> trickList;

  public Trick() {
    this.trickList = new ArrayList<>(Arrays.asList("Learn this", "Learn that", "Sleep", "Do some magic"));
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<String> trickList) {
    this.trickList = trickList;
  }

  public void removeElement (int removeId){
    trickList.remove(removeId);
  }
}
