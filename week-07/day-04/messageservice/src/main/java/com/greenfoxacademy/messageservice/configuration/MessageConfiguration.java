package com.greenfoxacademy.messageservice.configuration;


import com.greenfoxacademy.messageservice.service.EmailService;
import com.greenfoxacademy.messageservice.service.MessageService;
import com.greenfoxacademy.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageService emailService() {
    return new EmailService();
  }

  @Primary
  @Bean
  public MessageService twitterService() {
    return new TwitterService();
  }

  @Bean
  public MessageProceeder emailProceeder() {
    return new MessageProceeder(emailService());
  }

  @Primary
  @Bean
  public MessageProceeder twitterProceeder() {
    return new MessageProceeder(twitterService());
  }
}
