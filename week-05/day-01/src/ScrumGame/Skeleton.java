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

  }
}
HP: 2 * x * d6 (+d6)
        DP: x/2 * d6 (+d6/2)
        SP: x * d6 (+x)