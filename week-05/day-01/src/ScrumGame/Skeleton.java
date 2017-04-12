package ScrumGame;

import java.util.Random;

public class Skeleton extends Character {

  public Skeleton() {
    Random rand = new Random();
    int x = rand.nextInt(10) + 1;
    int y = rand.nextInt(10) + 1;
    while (!MapManager.checkTileValidStep(x, y)) {
      rand = new Random();
      x = rand.nextInt(10) + 1;
      y = rand.nextInt(10) + 1;
    }
    positionX = x;
    positionY = y;
    monsterType = "skeleton";
  }
}
