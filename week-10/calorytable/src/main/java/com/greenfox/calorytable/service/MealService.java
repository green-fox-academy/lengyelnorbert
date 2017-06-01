package com.greenfox.calorytable.service;

import com.greenfox.calorytable.model.Meal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MealService {

  @Autowired
  MealRepository mealRepository;

  public List<Meal> getMealList() {
    return mealRepository.findAll();
  }

  public int getTotalAmountOfCalory() {
    int totalCalory =0;
    for (Meal meal : getMealList()) {
      totalCalory += meal.getCalories();
    }
    return totalCalory;
  }

  public void saveNewMeal(Meal meal){
    mealRepository.save(meal);
  }

  public void deleteMeal(Long mealIdToDelete){
    mealRepository.delete(mealIdToDelete);
  }
}
