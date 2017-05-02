package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.entities.SayHelloEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SayHelloController {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
          "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló",
          "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
          "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
          "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/sayhello")
  public String sayHello(@RequestParam(value = "name", defaultValue = "") String name,
          Model model) {
    String randomSize;
    List<SayHelloEntity> sayHelloList = new ArrayList<>();

    for (int i = 0; i < hellos.length; i++) {
      Random rand = new Random();
      randomSize = String.valueOf(rand.nextInt(40) + 10);
      sayHelloList.add(new SayHelloEntity(hellos[i], randomSize, randomColorGenerator(),
              randomColorGenerator(), randomColorGenerator(), name));
    }
    model.addAttribute("sayHelloList", sayHelloList);
    return "sayhello";
  }

  private String randomColorGenerator() {
    Random rand = new Random();
    int randomColor = rand.nextInt(256);
    return String.valueOf(randomColor);
  }
}
