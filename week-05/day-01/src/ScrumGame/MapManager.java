package ScrumGame;

import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MapManager {

  static List<Tile> tileList = new ArrayList<>();

  public static void buildTheOriginalMap() {
    List<String> mapData;
    Tile wallPiece;
    Tile floorPiece;
    mapData = fileReading();
    char drawFloorOrWall;
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < 10; x++) {
        drawFloorOrWall = mapData.get(y).charAt(x);
        if (drawFloorOrWall == '1') {
//          PositionedImage wallImage = new PositionedImage("assets/wall.png", 72 * x, 72 * y);
//          wallImage.draw(graphics);
          wallPiece = new Tile(x, y, true);
          tileList.add(wallPiece);
        } else {
//          PositionedImage floorImage = new PositionedImage("assets/floor.png", 72 * x, 72 * y);
//          floorImage.draw(graphics);
          floorPiece = new Tile(x, y, false);
          tileList.add(floorPiece);
        }
      }
    }
  }

  public static void printOutTheOriginalMap(Graphics graphics){
    for (Tile t : tileList){
      if (t.isItWall==true){
        PositionedImage wallImage = new PositionedImage("assets/wall.png", 72 * t.positionX, 72 * t.positionY);
        wallImage.draw(graphics);
      }else {
        PositionedImage floorImage = new PositionedImage("assets/floor.png", 72 * t.positionX, 72 * t.positionY);
        floorImage.draw(graphics);
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

  public static List<String> fileReading() {
    List<String> mapData = new ArrayList<>();
    try {
      Path mapDataFile = Paths.get("assets/map_a.txt");
      mapData = Files.readAllLines(mapDataFile);
    } catch (IOException ex) {
      System.out.println("Error while reading the map file");
    }
    return mapData;
  }
}
