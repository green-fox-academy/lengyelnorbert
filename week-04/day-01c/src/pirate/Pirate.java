package pirate;

class Pirate {

  private int pirotDrunkness;
  private boolean isAlive;
  private boolean isPassedOut;


  Pirate() {
    isAlive = true;
    isPassedOut = false;
    pirotDrunkness = 0;
  }


  void drinkSomeRum() {
    if (isAlive) {
      pirotDrunkness++;
    } else {
      System.out.println("he's dead");
    }
  }

  String howsItGoingMate() {
    String pirateAnswer;
    if (isAlive) {
      pirateAnswer = pirotDrunkness < 5 ? "Pour me anudder!"
              : "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
      System.out.println(pirateAnswer);
    } else {
      pirateAnswer = "he's dead";
    }
    return pirateAnswer;
  }

  void die() {
    isAlive = false;
  }

  void setPassedOut() {
    isPassedOut = true;
  }

  void brawl(Pirate anotherPirate) {
    if (!isAlive) {
      System.out.println("he's dead");
    } else if (!anotherPirate.isAlive) {
      System.out.println("you can not figth against a dead pirate!");
    } else {
      // outcome: what happens:
      // 1- this Pirate dies,
      // 2- the other Pirate dies,
      // 3 - both pass out
      int outcome = (int) (Math.random() * 3) + 1;
      if (outcome == 1) {
        die();
      } else if (outcome == 2) {
        anotherPirate.die();
      } else {
        setPassedOut();
        anotherPirate.setPassedOut();
      }
    }
  }
}

