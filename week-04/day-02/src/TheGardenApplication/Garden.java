package TheGardenApplication;


import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> plants;
  int howManyPlantsNeedW;
  double waterPerPlant;

  Flower margareta = new Flower("yellow");
  Flower ibolya = new Flower("blue");
  Tree lilafa = new Tree("purple");
  Tree orangetree = new Tree("orange");


  public Garden() {
    plants = new ArrayList<>();
    howManyPlantsNeedW = 0;
    plants.add(margareta);
    plants.add(ibolya);
    plants.add(lilafa);
    plants.add(orangetree);
  }

  public void gardenInfo() {
    for (Plant plant : plants) {
      plant.info();
    }
  }

  public int howManyPlantsNeedWater() {
    howManyPlantsNeedW = 0;
    for (Plant plant : plants) {
      if (plant.needsWater > plant.waterLevel) {
        howManyPlantsNeedW++;
      }
    }
    return howManyPlantsNeedW;
  }

  public void waterThemAll(int waterAmount) {
    System.out.println("");
    System.out.println("Watering with " + waterAmount);
    howManyPlantsNeedW = howManyPlantsNeedWater();
    if (howManyPlantsNeedW != 0) {
      waterPerPlant = waterAmount / howManyPlantsNeedW;
      for (Plant plant : plants) {
        if (plant.needsWater > plant.waterLevel) {
          plant.waterLevel += waterPerPlant * plant.waterAbsorv;

        }
      }
    } else {
      System.out.println("No need to water");
    }
  }


}
