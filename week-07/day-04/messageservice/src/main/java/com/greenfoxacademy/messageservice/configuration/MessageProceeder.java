package com.greenfoxacademy.messageservice.configuration;


import com.greenfoxacademy.messageservice.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

  MessageService messageService;

  public MessageProceeder(MessageService messageService) {
    this.messageService = messageService;
  }

  public void processMessage(String s, String s1) {
    messageService.messageSending(s, s1);
  }
}
