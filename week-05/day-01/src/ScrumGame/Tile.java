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
  int positionX;
  int positionY;
  boolean isItWall;


  public Tile(int positionX, int positionY, boolean isItWall) {
    tileList = new ArrayList<>();
    this.positionX = positionX;
    this.positionY = positionY;
    this.isItWall = isItWall;
  }

  public void buildTheOriginalMap(Graphics graphics) {
    List<String> mapData = new ArrayList<>();
    char drawFloorOrWall;
    try {
      Path mapDataFile = Paths.get("assets/map_a.txt");
      mapData = Files.readAllLines(mapDataFile);
    } catch (IOException ex) {
      System.out.println("Error while reading the map file");
    }
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < 10; x++) {
        drawFloorOrWall = mapData.get(y).charAt(x);
        if (drawFloorOrWall == '1') {
          PositionedImage wallImage = new PositionedImage("assets/wall.png", 72 * x, 72 * y);
          wallImage.draw(graphics);
          Tile wallPiece = new Tile(x, y, true);
          tileList.add(wallPiece);
        } else {
          PositionedImage floorImage = new PositionedImage("assets/floor.png", 72 * x, 72 * y);
          floorImage.draw(graphics);
          Tile floorPiece = new Tile(x, y, false);
          tileList.add(floorPiece);
        }
      }
    }
  }
}
