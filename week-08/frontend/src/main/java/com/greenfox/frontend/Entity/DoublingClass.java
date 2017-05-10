package com.greenfox.frontend.Entity;

import org.springframework.stereotype.Component;


public class DoublingClass {

  private int received;
  private int result;

  public DoublingClass(int received) {
    this.received = received;
    result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}
