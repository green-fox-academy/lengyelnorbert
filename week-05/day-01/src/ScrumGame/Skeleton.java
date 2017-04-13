package ScrumGame;

import java.util.Random;

public class Skeleton extends Character {

  public Skeleton() {
    Random rand = new Random();
    int x = rand.nextInt(10);
    int y = rand.nextInt(10);
    while (!MapManager.checkTileValidStep(x, y) || Board.isCharacterOnThatTile(x, y)) {
      rand = new Random();
      x = rand.nextInt(10);
      y = rand.nextInt(10);
    }
    positionX = x;
    positionY = y;
    characterType = "skeleton";
    this.isCharacterAlive = true;
    this.characterCurrentHP =
            2 * Board.theWholeGameLevel * Character.rollTheDice(1);
    this.characterDefendPoints = (int)((double)Board.theWholeGameLevel / 2 * Character.rollTheDice(1));
    this.characterStrikePoints = Board.theWholeGameLevel * Character.rollTheDice(1);
  }

  public String skeletonInfo() {
    return this.characterType + " HP: " + this.characterCurrentHP + " | DP: " + this.characterDefendPoints + " | SP " + this.characterStrikePoints;
  }
}
