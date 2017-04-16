package pirate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PirateShipTest {

  @Test
  void fillShip() {
    PirateShip testShip = new PirateShip();
    testShip.fillShip();
    System.out.println(testShip.crew.size());
  }

  @Test
  void getShipInfo(){
    PirateShip testShip = new PirateShip();
    testShip.fillShip();
    System.out.println(testShip.getShipInfo());
    assertEquals("", testShip.getShipInfo());
  }

}