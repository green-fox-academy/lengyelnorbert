package com.greenfox.iamgroot.model;


public class Message implements ResponseMessage {

  private String received;
  private String traslated;

  public Message(String received) {
    this.received = received;
    traslated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTraslated() {
    return traslated;
  }

}
