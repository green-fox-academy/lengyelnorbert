package com.greenfox.frontend.Entity;


public class Appenda {

  private String appended;

  public Appenda(String textToAddA) {
    appended = textToAddA.concat("a");
  }

  public String getAppended() {
    return appended;
  }
}
