package com.greenfox.iamgroot.model;


public class ErrorMessage implements ResponseMessage{

  private String error;

  public ErrorMessage() {
    error = "general error";
  }

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

}
