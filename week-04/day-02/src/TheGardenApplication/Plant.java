package TheGardenApplication;


import java.util.ArrayList;

public class Plant {

  double needsWater;
  double waterLevel;
  double waterAbsorv;
  String plantType;
  String plantColor;


  public Plant() {
    waterLevel=0;

  }

  public void info() {
    if (needsWater > waterLevel) {
      System.out.println("The " + plantColor + " " + plantType + " needs water");
    } else {
      System.out.println("The " + plantColor + " " + plantType + " does not need water");
    }


  }
}