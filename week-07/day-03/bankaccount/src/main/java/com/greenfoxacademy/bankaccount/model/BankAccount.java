package com.greenfoxacademy.bankaccount.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean goodGuy;

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
