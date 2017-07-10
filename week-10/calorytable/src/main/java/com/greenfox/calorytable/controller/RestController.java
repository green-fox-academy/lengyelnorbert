package com.greenfox.calorytable.controller;


import com.greenfox.calorytable.model.DeleteMeal;
import com.greenfox.calorytable.model.Meal;
import com.greenfox.calorytable.service.MealService;
import java.util.HashMap;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  MealService mealService;

  @RequestMapping(value = "/getmeals", method = RequestMethod.GET)
  public List<Meal> mealList() {
    return mealService.getMealList();
  }

  @RequestMapping(value = "/getstats", method = RequestMethod.GET)
  public HashMap<String, Integer> getMealStats() {
    return mealService.getMealStat();
  }

  @RequestMapping(value = "/meal", method = RequestMethod.POST)
  public HashMap<String, String> saveArrivedMeal(@RequestBody @Valid Meal meal) {
    if (mealService.checkReceivedMessageToSaveIfValid(meal)) {
      mealService.saveNewMeal(meal);
      return mealService.getOKMessage();
    }
    return mealService.getErrorMessage();
  }

  @RequestMapping(value = "/meal", method = RequestMethod.PUT)
  public HashMap<String, String> updateArrivedMeal(@RequestBody Meal meal) {
    if (mealService.checkReceivedMessageToSaveIfValid(meal)) {
      if (mealService.checkReceivedMessageIdIfExistsAlready(meal)) {
        mealService.updateMeal(meal);
        return mealService.getOKMessage();
      } else {
        mealService.saveNewMeal(meal);
        return mealService.getOKMessage();
      }
    }
    return mealService.getErrorMessage();
  }

  @RequestMapping(value= "/meal", method = RequestMethod.DELETE)
  public HashMap<String, String> deleteRestMeal(@RequestBody DeleteMeal deleteMeal){
    mealService.deleteRestMeal(deleteMeal.getId());
    return mealService.getOKMessage();
  }
}
