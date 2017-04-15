package pirate;

import java.util.Random;

class Pirate {

  private int pirotDrunkness;
  private boolean isPirotAlive;


  Pirate() {
    isPirotAlive = true;
    pirotDrunkness = 0;
  }


  void drinkSomeRum() {
    if (isPirotAlive) {
      pirotDrunkness++;
    } else {
      System.out.println("he's dead");
    }
  }

  String howsItGoingMate() {
    String pirateAnswer;
    if (isPirotAlive) {
      pirateAnswer = pirotDrunkness < 5 ? "Pour me anudder!"
              : "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
      System.out.println(pirateAnswer);
    } else {
      pirateAnswer = "he's dead";
    }
    return pirateAnswer;
  }

  void die() {
    isPirotAlive = false;
  }

  void brawl(Pirate pirateToFigthAgainst){
    Random rn = new Random();
    int randomnumber = rn.nextInt(3) + 1;
    if (randomnumber == 1){
      
    }

  }
}
