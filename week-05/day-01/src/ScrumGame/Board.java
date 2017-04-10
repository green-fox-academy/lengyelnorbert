package ScrumGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {

  int myHeroX;
  int myHeroY;
  int lastFacingDirection;

  static Tile tile;

  public Board() {
    myHeroX = 0;
    myHeroY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    tile = new Tile(0, 0, false);
    tile.buildTheOriginalMap(graphics);

    PositionedImage myHeroImage;
    if (lastFacingDirection == 1) {
      myHeroImage = new PositionedImage("assets/hero-up.png", myHeroX, myHeroY);
      myHeroImage.draw(graphics);
    }
    else if (lastFacingDirection == 3) {
      myHeroImage = new PositionedImage("assets/hero-left.png", myHeroX, myHeroY);
      myHeroImage.draw(graphics);
    }
    else if (lastFacingDirection == 4) {
      myHeroImage = new PositionedImage("assets/hero-right.png", myHeroX, myHeroY);
      myHeroImage.draw(graphics);
    }
    else{
      myHeroImage = new PositionedImage("assets/hero-down.png", myHeroX, myHeroY);
      myHeroImage.draw(graphics);
    }
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
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
    int currentX = myHeroX / 72;
    int currentY = myHeroY / 72;
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (checkTileValidStep(currentX, currentY - 1)) {
        myHeroY -= 72;
        lastFacingDirection = 1;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (checkTileValidStep(currentX, currentY + 1)) {
        myHeroY += 72;
        lastFacingDirection = 2;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (checkTileValidStep(currentX - 1, currentY)) {
        myHeroX -= 72;
        lastFacingDirection = 3;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (checkTileValidStep(currentX + 1, currentY)) {
        myHeroX += 72;
        lastFacingDirection = 4;
      }
    }
    repaint();
  }

  public boolean checkTileValidStep(int toHereX, int toHereY) {
    for (Tile t : tile.tileList) {
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