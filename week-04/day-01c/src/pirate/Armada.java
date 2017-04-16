package pirate;

import java.util.ArrayList;
import java.util.List;

public class Armada {

  List<PirateShip> armadaShipList;
  int armadaID;
  static int armadaRunningTotalID = 1;


  Armada() {
    armadaShipList = new ArrayList<>();
    armadaID = armadaRunningTotalID;
    armadaRunningTotalID++;
  }

  void fillArmadaWithShips() {
    int randomNumberOfShipsInAmrada = (int) (15 + Math.random() * 6);
    for (int i = 0; i < randomNumberOfShipsInAmrada; i++) {
      PirateShip pirateShip = new PirateShip();
      pirateShip.fillShip();
      armadaShipList.add(pirateShip);
    }
  }

  boolean war(Armada otherArmada) {
    int thisShipCount = this.armadaShipList.size();
    int otherShipCount = otherArmada.armadaShipList.size();
    int thisLostShipCount = 0;
    int otherLostShipCount = 0;
    while (thisShipCount != thisLostShipCount
            && otherShipCount != otherLostShipCount) {
      PirateShip attacker = armadaShipList.get(thisLostShipCount);
      PirateShip attacked = otherArmada.armadaShipList.get(otherLostShipCount);
      fightInfoBeforeFight(otherArmada, attacker, attacked);
      if (attacker.battle(attacked)) {
        otherLostShipCount++;
      } else {
        thisLostShipCount++;
      }
      figthInfoAfterFight(otherArmada, attacker, attacked);
    }
    if (thisShipCount == thisLostShipCount) {
      return false;
    } else {
      return true;
    }

  }

  void fightInfoBeforeFight(Armada otherArmada, PirateShip thisArmadaPirateShip,
          PirateShip otherArmadaPirateShip) {
    System.out.println("Armada #" + armadaID + ", PirateShip #" + thisArmadaPirateShip.shipID
            + " attacked Armada #" + otherArmada.armadaID + ", PirateShip #"
            + otherArmadaPirateShip.shipID);
    System.out.println(thisArmadaPirateShip.getShipInfo());
    System.out.println(otherArmadaPirateShip.getShipInfo());
  }

  void figthInfoAfterFight(Armada otherArmada, PirateShip thisArmadaPirateShip,
          PirateShip otherArmadaPirateShip){
    System.out.println(thisArmadaPirateShip.getShipInfo());
    System.out.println(otherArmadaPirateShip.getShipInfo());
    System.out.println();

  }

}
