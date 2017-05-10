package com.greenfox.frontend.Entity;


public class ArrayToReturn2 implements GeneralReturnArray {

  private int[] result;

  public ArrayToReturn2() {
  }

  public ArrayToReturn2(int[] result) {
    this.result = result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

  public int[] getResult() {
    return result;
  }
}
