package com.greenfox.calorytable.service;


import com.greenfox.calorytable.model.MealType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MealTypeService {

  @Autowired
  MealTypeRepository mealTypeRepository;

  public void fillUpMealTypeListIfEmpty(){
    if (mealTypeRepository.findAll().size() == 0){
      fillUpMealTypeList();
    }
  }

  public void fillUpMealTypeList(){
    mealTypeRepository.save(new MealType ("Breakfast"));
    mealTypeRepository.save(new MealType ("Elevenses"));
    mealTypeRepository.save(new MealType ("Lunch"));
    mealTypeRepository.save(new MealType ("Snack"));
    mealTypeRepository.save(new MealType ("Dinner"));
    mealTypeRepository.save(new MealType ("Midnight Snack"));
  }

  public List<MealType> getMealTypeList() {
    return mealTypeRepository.findAll();
  }
}
