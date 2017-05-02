package com.greenfoxacademy.springstart.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SayHelloEntity {

  private final String helloType;
  private final String size;
  private final String colorR;
  private final String colorG;
  private final String colorB;
  private final String name;
}
