package com.greenfox.frontend.Entity;

public class DoUntil {

  private int until;
  private int result;

  public DoUntil() {
  }

  public DoUntil(int until) {
    this.until = until;
  }

  public void sumTheDountil() {
    for (int i = 0; i <= until; i++) {
      result += i;
    }
  }

  public void factorTheDountil() {
    int tempResult = 1;
    for (int i = 1; i <= until; i++) {
      tempResult = tempResult * i;
    }
    result = tempResult;
  }

  public int getUntil() {
    return until;
  }

  public int getResult() {
    return result;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
