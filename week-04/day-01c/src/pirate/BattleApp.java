package pirate;

public class BattleApp {

  public static void main(String[] args) {
    war();
  }

  static void battle(){
    PirateShip myFirstPirateShip = new PirateShip();
    PirateShip mySecondPirateShip = new PirateShip();

    myFirstPirateShip.fillShip();
    mySecondPirateShip.fillShip();

    System.out.println(myFirstPirateShip.getShipInfo());
    System.out.println(mySecondPirateShip.getShipInfo());

    myFirstPirateShip.battle(mySecondPirateShip);

    System.out.println(myFirstPirateShip.getShipInfo());
    System.out.println(mySecondPirateShip.getShipInfo());
  }

  static void war(){
    Armada armada1 = new Armada();
    Armada armada2 = new Armada();

    armada1.fillArmadaWithShips();
    armada2.fillArmadaWithShips();

    armada1.war(armada2);

  }


}
