package com.greenfox.calorytable.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MealType {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String mealTypeName;

  public MealType() {
  }

  public MealType(String mealTypeName) {
    this.mealTypeName = mealTypeName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMealTypeName() {
    return mealTypeName;
  }

  public void setMealTypeName(String mealTypeName) {
    this.mealTypeName = mealTypeName;
  }
}
