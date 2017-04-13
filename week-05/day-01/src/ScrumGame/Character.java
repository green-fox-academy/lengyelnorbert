package ScrumGame;

import java.util.Random;

public class Character extends GameObject {

  String characterType;
  int characterLevel;
  int characterMaxHP;
  int characterCurrentHP;
  int characterDefendPoints;
  int characterStrikePoints;
  boolean isCharacterAlive;


  public static int rollTheDice(int howManyTimeRollTheDice) {
    int finalAmountOfDiceRolls = 0;
    for (int i = 0; i < howManyTimeRollTheDice; i++) {
      Random rand = new Random();
      int n = rand.nextInt(6) + 1;
      finalAmountOfDiceRolls += n;
    }
    return finalAmountOfDiceRolls;
  }
}