package com.greenfoxacademy.messageservice.service;


public class TwitterService implements MessageService {

  @Override
  public void messageSending(String message, String adressee) {
    System.out.println("Twitter sent to " + adressee + " with Message= " + message);
  }
}
