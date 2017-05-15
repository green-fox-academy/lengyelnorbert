package com.greenfox.iamgroot.model;


public class ErrorMessage implements ResponseMessage{

  private String error;

  public ErrorMessage() {
    error = "I am Groot!";
  }

  public String getError() {
    return error;
  }

}
