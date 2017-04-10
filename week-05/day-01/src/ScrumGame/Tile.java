package ScrumGame;

import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tile extends GameObject {

  boolean isItWall = false;
  List<Tile> tileList;


  public Tile() {
    tileList = new ArrayList<>();
  }

  public void buildTheOriginalMap(Graphics graphics) {
    List<String> mapData = new ArrayList<>();
    char drawFloorOrWall;
//    int y = 0;
    try {
      Path mapDataFile = Paths.get("assets/map_a.txt");
      mapData = Files.readAllLines(mapDataFile);
    } catch (IOException ex) {
      System.out.println("error");
    }
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < 10; x++) {
        drawFloorOrWall = mapData.get(y).charAt(x);
        if (drawFloorOrWall == '1') {
          PositionedImage wallImage = new PositionedImage("assets/wall.png", 72 * x, 72 * y);
          wallImage.draw(graphics);
          Wall wallPiece = new Wall(x, y);
          isItWall = true;
          tileList.add(wallPiece);
        } else {
          PositionedImage floorImage = new PositionedImage("assets/floor.png", 72 * x, 72 * y);
          floorImage.draw(graphics);
          Floor floorPiece = new Floor(x, y);
          isItWall = false;
          tileList.add(floorPiece);
        }
      }
    }
  }
}
