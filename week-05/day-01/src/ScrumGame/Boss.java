package ScrumGame;

import java.util.Random;

public class Boss extends Character {

  public Boss() {
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
    characterType = "boss";
  }
}
