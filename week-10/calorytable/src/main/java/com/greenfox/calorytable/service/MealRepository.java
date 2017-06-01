package com.greenfox.calorytable.service;


import com.greenfox.calorytable.model.Meal;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MealRepository extends CrudRepository<Meal, Long> {

  List<Meal> findAll();
}
