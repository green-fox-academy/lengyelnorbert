package com.greenfox.iamgroot.model;


public class Message implements ResponseMessage {

  private String received;
  private String translated;

  public Message(String received) {
    this.received = received;
    translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

}
