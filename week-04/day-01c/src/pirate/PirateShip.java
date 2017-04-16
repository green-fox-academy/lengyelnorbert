package pirate;

import java.util.ArrayList;
import java.util.List;

class PirateShip {

  List<Pirate> crew;
  Captain captain;
  int shipID;
  static int runningTotalShipID = 1;

  PirateShip() {
    crew = new ArrayList<>();
    this.shipID = runningTotalShipID;
    runningTotalShipID++;
  }

  void fillShip() {
    captain = new Captain();
    int randomNumberOfPiratesOnBoard = 50 + (int) (Math.random() * 51);
    for (int i = 0; i < randomNumberOfPiratesOnBoard; i++) {
      Pirate pirate = new Pirate();
      pirate.setPirateID(i);
      crew.add(pirate);
    }
  }

  int getLivingPiratesOnBoardCount() {
    int piratesAliveNumber = 0;
    for (Pirate pirate : crew) {
      if (pirate.isAlive) {
        piratesAliveNumber++;
      }
    }
    return piratesAliveNumber;
  }

  String getShipInfo() {
    String captainPassedOut = (captain.isPassedOut) ? "is passed out" : "is concious";
    String captainAlive = (captain.isAlive) ? "is alive" : "is dead";
    String shipInfo =
            "Pirate ship #" + shipID + ", captain consumed rum amount: " + captain.rumConsumedSoFar
                    + ", captain " + captainPassedOut + ", captain " + captainAlive + ". There are "
                    + getLivingPiratesOnBoardCount() + " alive pirates on board.";

    return shipInfo;
  }

  boolean battle(PirateShip otherShip) {
    boolean isThisShipWon;
    int thisShipFightScore = getLivingPiratesOnBoardCount() - captain.rumConsumedSoFar;
    int otherShipFightScore =
            otherShip.getLivingPiratesOnBoardCount() - otherShip.captain.rumConsumedSoFar;
    if (thisShipFightScore >= otherShipFightScore) {
      isThisShipWon = true;
      rumPartyForTheWinner(this);
      killTheLooserPirates(otherShip);
    } else {
      isThisShipWon = false;
      rumPartyForTheWinner(otherShip);
      killTheLooserPirates(this);
    }
    return isThisShipWon;
  }

  List<Pirate> getListOfAliveCrew(List<Pirate> crewList) {
    List<Pirate> listOfAliveCrew = new ArrayList<>();
    for (Pirate pirate : crewList) {
      if (pirate.isAlive) {
        listOfAliveCrew.add(pirate);
      }
    }
    return listOfAliveCrew;
  }

  void killTheLooserPirates(PirateShip looserShip) {
    int totalPiratesKilled = 0;
    List<Pirate> aliveCrew = getListOfAliveCrew(looserShip.crew);
    for (Pirate pirate : aliveCrew) {
      int willPirateDie = (int) (Math.random() * 2);
      if (willPirateDie == 0) {
        pirate.die();
        totalPiratesKilled++;
      }
    }
    System.out.println(
            "During the battle on the looser ship PirateShip #" + looserShip.shipID + ", "
                    + totalPiratesKilled + " pirates died.");
  }

  void rumPartyForTheWinner(PirateShip winnerShip) {
    List<Pirate> aliveCrew = getListOfAliveCrew(winnerShip.crew);
    int totalAmountOfRum = (int) (Math.random() * 5 * winnerShip.getLivingPiratesOnBoardCount());
    int totalRum = totalAmountOfRum;
    while (totalAmountOfRum > 0) {
      winnerShip.captain.rumConsumedSoFar++;
      totalAmountOfRum--;
      for (Pirate pirate : aliveCrew) {
        if (totalAmountOfRum > 0) {
          pirate.rumConsumedSoFar++;
          totalAmountOfRum--;
        }
      }
    }
    System.out.println(
            "After the battle the winner ship PirateShip #" + winnerShip.shipID + " had "
                    + totalRum + " rums to drink.");
  }
}
