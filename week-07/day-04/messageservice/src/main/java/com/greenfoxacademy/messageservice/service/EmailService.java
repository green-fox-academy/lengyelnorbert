package com.greenfoxacademy.messageservice.service;


public class EmailService implements MessageService {

  @Override
  public void messageSending(String message, String adressee) {
    System.out.println("Email sent to " + adressee + " with Message= " + message);
  }
}
