package ScrumGame;

import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tile extends GameObject {
  List<Tile> tileList;
  boolean isItWall;


  public Tile(int positionX, int positionY, boolean isItWall) {
//    tileList = new ArrayList<>();
    this.positionX = positionX;
    this.positionY = positionY;
    this.isItWall = isItWall;
  }


}
