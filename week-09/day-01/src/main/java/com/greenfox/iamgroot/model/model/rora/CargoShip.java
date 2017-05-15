package com.greenfox.iamgroot.model.model.rora;


public class CargoShip {
  private static int capacity = 12500;
  private static int currentCargo;

  public CargoShip() {
    capacity = 12500;
  }

  public static int getCapacity() {
    return capacity;
  }

  public static void setCapacity(int capacity) {
    CargoShip.capacity = capacity;
  }

  public static int getCurrentCargo() {
    return currentCargo;
  }

  public static void setCurrentCargo(int currentCargo) {
    CargoShip.currentCargo = currentCargo;
  }
}
