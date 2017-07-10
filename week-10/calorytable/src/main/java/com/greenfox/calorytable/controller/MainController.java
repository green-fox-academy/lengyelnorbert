package com.greenfox.calorytable.controller;


import com.greenfox.calorytable.model.Meal;
import com.greenfox.calorytable.service.MealService;
import com.greenfox.calorytable.service.MealTypeService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  @Autowired
  MealService mealService;

  @Autowired
  MealTypeService mealTypeService;

  @RequestMapping(value = {"/"}, method = RequestMethod.GET)
  public String index(Model model, Meal meal) {
    mealTypeService.fillUpMealTypeListIfEmpty();
    model.addAttribute("mealList", mealService.getMealList());
    model.addAttribute("totalCalory", mealService.getTotalAmountOfCalory());
    return "index";
  }

  @RequestMapping(value = {"/addnewmeal"}, method = RequestMethod.GET)
  public String addNewMeal(Model model, Meal meal) {
    model.addAttribute("mealList", mealService.getMealList());
    model.addAttribute("totalCalory", mealService.getTotalAmountOfCalory());
    model.addAttribute("mealTypeList", mealTypeService.getMealTypeList());
    return "addnewmeal";
  }

  @RequestMapping(value = {"/addnewmeal"}, method = RequestMethod.POST)
  public String submitNewMeal(Model model, @Valid Meal meal, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      model.addAttribute("mealList", mealService.getMealList());
      model.addAttribute("totalCalory", mealService.getTotalAmountOfCalory());
      model.addAttribute("mealTypeList", mealTypeService.getMealTypeList());
      return "addnewmeal";
    }
    mealService.saveNewMeal(meal);
    return "redirect:/";
  }

  @RequestMapping(value = {"/deletemeal/{id}"}, method = RequestMethod.GET)
  public String deleteMeal(@PathVariable("id") Long mealIdToDelete) {
    mealService.deleteMeal(mealIdToDelete);
    return "redirect:/";
  }

  @RequestMapping(value = {"/editmeal/{id}"}, method = RequestMethod.GET)
  public String editMeal(Model model, @PathVariable("id") Long mealIdToEdit) {
    model.addAttribute(mealService.getOneMeal(mealIdToEdit));
    model.addAttribute("mealList", mealService.getMealList());
    model.addAttribute("totalCalory", mealService.getTotalAmountOfCalory());
    model.addAttribute("mealTypeList", mealTypeService.getMealTypeList());
    return "editmeal";
  }
}