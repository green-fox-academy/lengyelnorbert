package com.greenfoxacademy.bankaccount.controller;


import com.greenfoxacademy.bankaccount.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

  @RequestMapping("/exercise1")
  public String bankAccount(Model model) {
    BankAccount firstAccount = new BankAccount("Symba", 2000, "lion", false, false);
    model.addAttribute("firstAccount", firstAccount);
    return "exercise1";
  }

  @RequestMapping("/exercise4")
  public String textUtext(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "exercise4";
  }

  @RequestMapping("/exercise5")
  public String bankAccountList(Model model) {
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Symba", 2000, "lion", false, false));
    accountList.add(new BankAccount("Rofi", 200, "pig", true, true));
    accountList.add(new BankAccount("Trombi", 4400, "elephant", true, true));
    accountList.add(new BankAccount("Jeno", 50000, "greenfox", false, false));
    accountList.add(new BankAccount("John", 2500, "monkey", false, true));
    accountList.add(new BankAccount("Kroko", 5552500, "crocodile", false, false));
    model.addAttribute("accountList", accountList);
    return "exercise5";
  }

  @RequestMapping("/exercise6")
  public String bankAccountList2(Model model) {
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Joe", 2000, "lion", false, true));
    accountList.add(new BankAccount("Rofi", 200, "pig", true, true));
    accountList.add(new BankAccount("Misi", 44400, "elephant", true, false));
    accountList.add(new BankAccount("Jeno", 50000, "greenfox", false, false));
    accountList.add(new BankAccount("John", 254400, "monkey", false, true));
    accountList.add(new BankAccount("Kroko", 5552500, "crocodile", false, true));
    model.addAttribute("accountList", accountList);
    return "exercise6";
  }

  @RequestMapping("/exercise9")
  public String bankAccountList3(Model model) {
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Joe", 2000, "lion", true, true));
    accountList.add(new BankAccount("GThePig", 200, "pig", true, true));
    accountList.add(new BankAccount("Misi", 44400, "elephant", true, false));
    accountList.add(new BankAccount("Jeno", 50000, "greenfox", false, false));
    accountList.add(new BankAccount("John", 254400, "monkey", false, true));
    accountList.add(new BankAccount("Kroko", 5552500, "crocodile", false, true));
    model.addAttribute("accountList", accountList);
    return "exercise9";
  }

  @RequestMapping(value = "/exercise10")
  public String bankAccountList10(Model model) {
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Joe", 30, "lion", true, true));
    accountList.add(new BankAccount("GThePig", 200, "pig", true, true));
    accountList.add(new BankAccount("Misi", 400, "elephant", true, false));
    accountList.add(new BankAccount("Jeno", 50, "greenfox", false, false));
    accountList.add(new BankAccount("John", 20, "monkey", false, true));
    accountList.add(new BankAccount("Kroko", 50, "crocodile", false, true));
    model.addAttribute("accountList", accountList);
    return "exercise10";
  }
}
//, method= RequestMethod.POST
