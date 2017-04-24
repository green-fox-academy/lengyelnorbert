package parkinglot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  static List<Car> myCarList = new ArrayList<>();

  public static void main(String[] args) {
    carProduction();
    getCarListInfo(myCarList);
  }

  public static void carProduction() {
    for (int i = 0; i < 256; i++) {
      Car myCar = new Car();
      myCarList.add(myCar);
    }
  }

  public static void getCarListInfo(List<Car> myCarList) {
    int bltrab = 0;
    int bllada = 0;
    int whtrab = 0;
    int whlada = 0;
    String bltrabs = "Black Trabant: ";
    String blladas = "Black Lada: ";
    String whtrabs = "White Trabant: ";
    String whladas = "White Lada: ";
    List<Integer> carOccurenceList = new ArrayList<>();
    for (Car car : myCarList) {
      if (car.color == CarColor.BLACK) {
        if (car.type == CarType.TRABANT) {
          bltrab++;
        } else if (car.type == CarType.LADA) {
          bllada++;
        }
      }
      if (car.color == CarColor.WHITE) {
        if (car.type == CarType.TRABANT) {
          whtrab++;
        } else if (car.type == CarType.LADA) {
          whlada++;
        }
      }
    }
    System.out.println(
            bltrabs + bltrab + " | " + whtrabs + whtrab + " | " + blladas + bllada + " | " + whladas
                    + whlada);
    carOccurenceList.add(bltrab);
    carOccurenceList.add(whtrab);
    carOccurenceList.add(bllada);
    carOccurenceList.add(whlada);

    int result = Collections.max(carOccurenceList);
    System.out.println("The most commen vehicle: " );
    if (result == bltrab) {
      System.out.println(bltrabs + bltrab);
    } else if (result == whtrab + whtrab) {
      System.out.println(whtrabs);
    } else if (result == bllada) {
      System.out.println(blladas + bllada);
    } else if (result == whlada + whlada) {
      System.out.println(whladas);
    }
  }
}
