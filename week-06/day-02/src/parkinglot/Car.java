package parkinglot;

public class Car {

  CarColor color;
  CarType type;

  Car() {
    int r = (int) (Math.random() * 2);
    if (r == 1) {
      color = CarColor.BLACK;
    } else {
      color = CarColor.WHITE;
    }
    int a = (int) (Math.random() * 2);
    if (a == 1) {
      type = CarType.LADA;
    } else {
      type = CarType.TRABANT;
    }
  }

  public String carInfo() {
    String actualColor = "";
    String actualType = "";
    if (color == CarColor.BLACK) {
      actualColor = "black";
    } else if (color == CarColor.WHITE) {
      actualColor = "white";
    }
    if (type == CarType.LADA) {
      actualType = "Lada";
    } else if (type == CarType.TRABANT) {
      actualType = "Traban";
    }
    String carInfo = actualType + ",  " + actualColor + " | ";
    return carInfo;
  }
}
