package pirate;

import java.util.ArrayList;
import java.util.List;

class PirateShip {
  List<Pirate> crew;
  Captain captain;

  PirateShip() {
    crew = new ArrayList<>();
  }

  void fillShip(){
    captain = new Captain();
    int randomNumberOfPiratesOnBoard = 50 + (int) (Math.random() * 51);
    for (int i = 0; i < randomNumberOfPiratesOnBoard; i++) {
      Pirate pirate = new Pirate();
      pirate.setPirateID(i);
      crew.add(pirate);
    }
  }




}
