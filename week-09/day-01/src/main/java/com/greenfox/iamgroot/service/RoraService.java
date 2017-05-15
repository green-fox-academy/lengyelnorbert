package com.greenfox.iamgroot.service;

import com.greenfox.iamgroot.model.model.rora.Cargo;
import com.greenfox.iamgroot.model.model.rora.CargoFillReturn;
import com.greenfox.iamgroot.model.model.rora.CargoShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoraService {

  @Autowired
  Cargo cargo;

  @Autowired
  CargoFillReturn cargoFillReturn;

  public RoraService() {
  }

  public void fill(String caliber, int amount) {
    if (caliber.equals(".25")) {
      cargo.setCaliber25(cargo.getCaliber25() + amount);
      setShipStatusandReadyness();
    } else if (caliber.equals(".30")) {
      cargo.setCaliber30(cargo.getCaliber30() + amount);
      setShipStatusandReadyness();
    } else if (caliber.equals(".50")) {
      cargo.setCaliber50(cargo.getCaliber50() + amount);
      setShipStatusandReadyness();
    }
    cargoFillReturn.setReceived(caliber);
    cargoFillReturn.setAmount(amount);
    cargoFillReturn.setShipstatus(cargo.getShipstatus());
    cargoFillReturn.setReady(cargo.isReady());
  }

  void setShipStatusandReadyness() {
    int totalCargo = cargo.getCaliber25() + cargo.getCaliber30() + cargo.getCaliber50();
    if (totalCargo == 0) {
      cargo.setShipstatus("empty");
      cargo.setReady(false);
    } else if (totalCargo == CargoShip.getCapacity()) {
      cargo.setShipstatus("full");
      cargo.setReady(true);
    } else if (totalCargo > CargoShip.getCapacity()) {
      cargo.setShipstatus("overloaded");
      cargo.setReady(false);
    } else {
      cargo.setShipstatus(String.valueOf(totalCargo * 100 / CargoShip.getCapacity()).concat("%"));
      cargo.setReady(false);
    }
  }
}
