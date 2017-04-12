package ScrumGame;

import java.util.List;

public class Tile extends GameObject {
  List<Tile> tileList;
  boolean isItWall;


  public Tile(int positionX, int positionY, boolean isItWall) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.isItWall = isItWall;
  }
}
