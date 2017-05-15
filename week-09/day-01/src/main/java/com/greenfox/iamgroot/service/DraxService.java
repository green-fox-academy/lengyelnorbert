package com.greenfox.iamgroot.service;


import com.greenfox.iamgroot.model.calorie.CalorieTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DraxService {

  @Autowired
  CalorieTable calorieTable;

  public CalorieTable getCalorieTable() {
    return calorieTable;
  }
}
