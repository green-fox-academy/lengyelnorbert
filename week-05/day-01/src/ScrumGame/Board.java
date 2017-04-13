package ScrumGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {

  Hero myHero;
  Skeleton skel1, skel2, skel3;
  Boss boss1;
  static int theWholeGameLevel;
  int lastFacingDirection;
  static List<Character> allTheCharacters;

  public Board() {
    MapManager.buildTheOriginalMap();
    placingAllTheCharacters();

    setPreferredSize(new Dimension(1200, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    MapManager.printOutTheOriginalMap(graphics);

    PositionedImage skel1Image;
    skel1Image = new PositionedImage("assets/skeleton.png", skel1.positionX * 72,
            skel1.positionY * 72);
    skel1Image.draw(graphics);
    PositionedImage skel2Image;
    skel2Image = new PositionedImage("assets/skeleton.png", skel2.positionX * 72,
            skel2.positionY * 72);
    skel2Image.draw(graphics);
    PositionedImage skel3Image;
    skel3Image = new PositionedImage("assets/skeleton.png", skel3.positionX * 72,
            skel3.positionY * 72);
    skel3Image.draw(graphics);

    PositionedImage boss1Image;
    boss1Image = new PositionedImage("assets/boss.png", boss1.positionX * 72, boss1.positionY * 72);
    boss1Image.draw(graphics);

    graphics.drawString(myHero.heroInfo(), 730, 25);

    PositionedImage myHeroImage;
    if (lastFacingDirection == 1) {
      myHeroImage = new PositionedImage("assets/hero-up.png", myHero.positionX * 72,
              myHero.positionY * 72);
    } else if (lastFacingDirection == 3) {
      myHeroImage = new PositionedImage("assets/hero-left.png", myHero.positionX * 72,
              myHero.positionY * 72);
    } else if (lastFacingDirection == 4) {
      myHeroImage = new PositionedImage("assets/hero-right.png", myHero.positionX * 72,
              myHero.positionY * 72);
    } else {
      myHeroImage = new PositionedImage("assets/hero-down.png", myHero.positionX * 72,
              myHero.positionY * 72);
    }
    myHeroImage.draw(graphics);
  }

  public static void main(String[] args) {
    theWholeGameLevel = 0;
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }
  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    lastFacingDirection = 1;
    int currentX = myHero.positionX;
    int currentY = myHero.positionY;
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (MapManager.checkTileValidStep(currentX, currentY - 1)) {
        myHero.positionY -= 1;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      lastFacingDirection = 2;
      if (MapManager.checkTileValidStep(currentX, currentY + 1)) {
        myHero.positionY += 1;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      lastFacingDirection = 3;
      if (MapManager.checkTileValidStep(currentX - 1, currentY)) {
        myHero.positionX -= 1;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      lastFacingDirection = 4;
      if (MapManager.checkTileValidStep(currentX + 1, currentY)) {
        myHero.positionX += 1;
      }
    }
    repaint();
  }

  public void placingAllTheCharacters() {
    allTheCharacters = new ArrayList<>();
    allTheCharacters.add(myHero = new Hero(0, 0));
    allTheCharacters.add(skel1 = new Skeleton());
    allTheCharacters.add(skel2 = new Skeleton());
    allTheCharacters.add(skel3 = new Skeleton());
    allTheCharacters.add(boss1 = new Boss());
  }

  public static boolean isCharacterOnThatTile(int inThatX, int inThatY) {
    for (Character c : allTheCharacters) {
      if (c.positionX == inThatX && c.positionY == inThatY) {
        return true;
      }
    }
    return false;
  }
}

