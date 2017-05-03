package com.greenfoxacademy.bankaccount.controller;


import com.greenfoxacademy.bankaccount.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

  @RequestMapping("/exercise1")
  public String bankAccount(Model model) {
    BankAccount firstAccount = new BankAccount("Symba", 2000, "lion");
    model.addAttribute("firstAccount", firstAccount);
    return "exercise1";
  }

  @RequestMapping("/exercise4")
  public String textUtext(Model model){
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "exercise4";
  }

  @RequestMapping("/exercise5")
  public String bankAccountList(Model model){
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Rofi", 200, "pig"));
    accountList.add(new BankAccount("Trombi", 4400, "elephant"));
    accountList.add(new BankAccount("Jeno", 50000, "greenfox"));
    accountList.add(new BankAccount("John", 2500, "monkey"));
    accountList.add(new BankAccount("Kroko", 5552500, "crocodile"));
    model.addAttribute("accountList", accountList);
    return "exercise5";
  }
}
