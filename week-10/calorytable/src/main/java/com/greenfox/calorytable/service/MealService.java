package com.greenfox.calorytable.service;

import com.greenfox.calorytable.model.Meal;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MealService {

  boolean isMessageValid;

  @Autowired
  MealRepository mealRepository;

  public List<Meal> getMealList() {
    return mealRepository.findAll();
  }

  public int getTotalAmountOfCalory() {
    int totalCalory = 0;
    for (Meal meal : getMealList()) {
      totalCalory += meal.getCalories();
    }
    return totalCalory;
  }

  public void saveNewMeal(Meal meal) {
    mealRepository.save(meal);
  }

  public void deleteMeal(Long mealIdToDelete) {
    mealRepository.delete(mealIdToDelete);
  }

  public Meal getOneMeal(Long mealID) {
    return mealRepository.findOne(mealID);
  }

  public int getTotalMealsAmount() {
    return mealRepository.findAll().size();
  }

  public HashMap<String, Integer> getMealStat() {
    HashMap<String, Integer> mealStat = new HashMap<>();
    mealStat.put("Total calories:", getTotalAmountOfCalory());
    mealStat.put("Total amount of meals:", getTotalMealsAmount());
    return mealStat;
  }

  public HashMap<String, String> getOKMessage() {
    HashMap<String, String> okMessage = new HashMap<>();
    okMessage.put("status", "ok");
    return okMessage;
  }

  public HashMap<String, String> getErrorMessage() {
    HashMap<String, String> errorMessage = new HashMap<>();
    errorMessage.put("status", "error");
    return errorMessage;
  }

  public boolean checkReceivedMessageToSaveIfValid(Meal meal) {
    isMessageValid = true;
    checkIfMessageIDValid(meal);
    checkIfMessageDateValid(meal);
    return isMessageValid;
  }

  public void checkIfMessageIDValid(Meal meal) {
    try {
      Integer mealIdInt = (int) (long) meal.getId();
    } catch (Exception ex) {
      isMessageValid = false;
    }
  }

  public void checkIfMessageDateValid(Meal meal) {
  }

  public boolean checkReceivedMessageIdIfExistsAlready(Meal meal) {
    if (mealRepository.exists(meal.getId())) {
      return true;
    }
    return false;
  }
  public void updateMeal(Meal meal){
    Meal mealToUpdate = mealRepository.findOne(meal.getId());
    mealToUpdate.setDate(meal.getDate());
    mealToUpdate.setType(meal.getType());
    mealToUpdate.setDescription(meal.getDescription());
    mealToUpdate.setCalories(meal.getCalories());
    mealRepository.save(mealToUpdate);
  }

  public void deleteRestMeal(Long id){
    if (mealRepository.exists(id)){
      mealRepository.delete(id);
    }
  }
}


