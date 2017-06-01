package com.greenfox.calorytable.service;


import com.greenfox.calorytable.model.MealType;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MealTypeRepository extends CrudRepository<MealType, Long> {

  List<MealType> findAll();
}
