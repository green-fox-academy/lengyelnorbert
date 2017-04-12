package ScrumGame;

import ScrumGame.PositionedImage;
import ScrumGame.Tile;
import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MapManager {
  static List<Tile> tileList;


  public static void buildTheOriginalMap(Graphics graphics) {
    tileList = new ArrayList<>();
    Tile wallPiece;
    Tile floorPiece;
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
          wallPiece = new Tile(x, y, true);
          tileList.add(wallPiece);
        } else {
          PositionedImage floorImage = new PositionedImage("assets/floor.png", 72 * x, 72 * y);
          floorImage.draw(graphics);
          floorPiece = new Tile(x, y, false);
          tileList.add(floorPiece);
        }
      }
    }
  }

  public static boolean checkTileValidStep(int toHereX, int toHereY) {
    for (Tile t : MapManager.tileList) {
      if (toHereX == t.positionX && toHereY == t.positionY) {
        if (t.isItWall) {
          return false;
        } else {
          return true;
        }
      }
    }
    return false;
  }
}
