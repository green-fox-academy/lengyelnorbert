package ScrumGame;


import java.util.Random;

public class Boss extends Character {

  public Boss() {
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
  }
}


