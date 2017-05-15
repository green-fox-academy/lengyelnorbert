package com.greenfox.iamgroot.model.calorie;


import com.greenfox.iamgroot.model.ResponseMessage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalorieTable implements ResponseMessage {

  private List<Food> calorieTable;


  public CalorieTable() {
  }

  public List<Food> getCalorieTable() {
    return calorieTable;
  }

  public void setCalorieTable(List<Food> calorieTable) {
    this.calorieTable = calorieTable;
  }

  public void addFoodToCalorieTable(Food food){
    calorieTable.add(food);
  }
}
