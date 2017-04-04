
import java.util.Random;

public class Pirate {

  int pirateDrunkness;
  boolean pirPassedOut = false;
  boolean pirDead = false;
  int parrot = 1;

  public void drinkSomeRum() {
    if (pirDead) {
      pirIsDead();
    } else {
      pirateDrunkness++;
    }
  }

  public void howsItGoingMate() {
    if (pirDead) {
      pirIsDead();
    } else if (pirateDrunkness < 5) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      pirPassedOut = true;
    }
  }

  public void die(){
    pirDead = true;
  }

  public void pirIsDead(){
    System.out.println("He's dead!");
  }

  public void brawl (Pirate figthWithThisPirade){
    if (pirDead){
      pirIsDead();
    }
    else if (figthWithThisPirade.pirDead){
      System.out.println("You can not fight with a dead pirate!");
    }
    else{
      Random rand = new Random();
      int n = rand.nextInt(3) + 1;
      if (n == 1){
        die();
      }
      else if (n == 2){
        figthWithThisPirade.die();
      }
      else {
        die();
        figthWithThisPirade.die();
      }
    }

  }


}


