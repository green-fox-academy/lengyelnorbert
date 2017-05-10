package com.greenfox.frontend.Entity;


public class WelcomeMessage {

  private String welcome_message;

  public WelcomeMessage(String name, String title) {
    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}
