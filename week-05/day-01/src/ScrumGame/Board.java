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
  static int theWholeGameLevel = 1;
  int lastFacingDirection;
  static List<Character> allTheCharacters;
  static boolean readyToFight = false;
  String nnn;


  public Board() {
    MapManager.buildTheOriginalMap();
    placingAllTheCharacters();
    theWholeGameLevel += 1;
    setPreferredSize(new Dimension(1200, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    MapManager.printOutTheOriginalMap(graphics);

    if (skel1.isCharacterAlive) {
      PositionedImage skel1Image;
      skel1Image = new PositionedImage("assets/skeleton.png", skel1.positionX * 72,
              skel1.positionY * 72);
      skel1Image.draw(graphics);
    }
    if (skel2.isCharacterAlive) {
      PositionedImage skel2Image;
      skel2Image = new PositionedImage("assets/skeleton.png", skel2.positionX * 72,
              skel2.positionY * 72);
      skel2Image.draw(graphics);
    }
    if (skel3.isCharacterAlive) {
      PositionedImage skel3Image;
      skel3Image = new PositionedImage("assets/skeleton.png", skel3.positionX * 72,
              skel3.positionY * 72);
      skel3Image.draw(graphics);
    }

    if (boss1.isCharacterAlive) {
      PositionedImage boss1Image;
      boss1Image = new PositionedImage("assets/boss.png", boss1.positionX * 72,
              boss1.positionY * 72);
      boss1Image.draw(graphics);
    }

    graphics.drawString(myHero.heroInfo(), 730, 20);
    graphics.drawString(skel1.skeletonInfo(), 730, 40);
    graphics.drawString(skel2.skeletonInfo(), 730, 55);
    graphics.drawString(skel3.skeletonInfo(), 730, 70);
    graphics.drawString(boss1.bossInfo(), 730, 90);

    if (isThereMonsterOnThatTile(myHero.positionX, myHero.positionY)) {
      nnn = "Monster!!! Press Space and fight for your life!!!";
      readyToFight = true;
    } else {
      nnn = "no monster here...";
      readyToFight = false;
    }
    graphics.drawString(nnn, 730, 130);

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

    checkForMonstersOnTheLevel();

  }

  public static void main(String[] args) {

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
    if (e.getKeyCode() == KeyEvent.VK_SPACE && (readyToFight)) {
      fightForYourLife();
    } else if (e.getKeyCode() == KeyEvent.VK_UP) {
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

  public static boolean isThereMonsterOnThatTile(int inThatX, int inThatY) {
    for (Character c : allTheCharacters) {
      if (c.characterType != "hero" && c.positionX == inThatX && c.positionY == inThatY) {
        return true;
      }
    }
    return false;
  }


  public void fightForYourLife() {
    int indexToRemove = 0;
    for (int i = 0; i < allTheCharacters.size(); i++) {
      if (allTheCharacters.get(i).characterType != "hero"
              && allTheCharacters.get(i).positionX == myHero.positionX
              && allTheCharacters.get(i).positionY == myHero.positionY) {
        indexToRemove = i;
        while (myHero.isCharacterAlive && allTheCharacters.get(i).isCharacterAlive) {
          int myHeroAttack = myHero.strikeValue();
          int monsterAttack = allTheCharacters.get(i).strikeValue();
          if (myHeroAttack > allTheCharacters.get(i).characterDefendPoints) {
            allTheCharacters.get(i).characterCurrentHP -=
                    myHeroAttack - allTheCharacters.get(i).characterDefendPoints;
            if (allTheCharacters.get(i).characterCurrentHP <= 0) {
              allTheCharacters.get(i).isCharacterAlive = false;
            }
          }
          if (monsterAttack > myHero.characterDefendPoints && allTheCharacters
                  .get(i).isCharacterAlive) {
            myHero.characterCurrentHP -= monsterAttack - myHero.characterDefendPoints;
          }
          if (myHero.characterCurrentHP <= 0) {
            myHero.isCharacterAlive = false;
            System.exit(0);
          }
        }
      }
    }
    if (!myHero.isCharacterAlive) {
      allTheCharacters.remove(myHero);
    }
    if (!allTheCharacters.get(indexToRemove).isCharacterAlive) {
      allTheCharacters.remove(indexToRemove);
    }
  }

  public void checkForMonstersOnTheLevel() {
    if (allTheCharacters.size() == 1) {
      theWholeGameLevel++;
      placingAllTheCharacters();
    }
  }
}
