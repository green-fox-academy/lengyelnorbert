package ScrumGame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {
  Hero myHero;
  int lastFacingDirection;
  Skeleton skel1;
  Skeleton skel2;
  Skeleton skel3;
//  List<Skeleton> skeletonList;


  public Board() {
    MapManager.buildTheOriginalMap();
    myHero = new Hero(0, 0);
    skel1 = new Skeleton();
    skel2 = new Skeleton();
    skel3 = new Skeleton();
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
//    MapManager.buildTheOriginalMap(graphics);
    MapManager.printOutTheOriginalMap(graphics);
//    skel1 = new Skeleton();
//    skel2 = new Skeleton();
//    skel3 = new Skeleton();

    PositionedImage skel1Image;
    skel1Image = new PositionedImage("assets/skeleton.png", skel1.positionX * 72, skel1.positionY * 72);
    skel1Image.draw(graphics);
    PositionedImage skel2Image;
    skel2Image = new PositionedImage("assets/skeleton.png", skel2.positionX * 72, skel2.positionY * 72);
    skel2Image.draw(graphics);
    PositionedImage skel3Image;
    skel3Image = new PositionedImage("assets/skeleton.png", skel3.positionX * 72, skel3.positionY * 72);
    skel3Image.draw(graphics);

    PositionedImage myHeroImage;
    if (lastFacingDirection == 1) {
      myHeroImage = new PositionedImage("assets/hero-up.png", myHero.positionX * 72, myHero.positionY * 72);
    } else if (lastFacingDirection == 3) {
      myHeroImage = new PositionedImage("assets/hero-left.png", myHero.positionX * 72, myHero.positionY * 72);
    } else if (lastFacingDirection == 4) {
      myHeroImage = new PositionedImage("assets/hero-right.png", myHero.positionX * 72, myHero.positionY * 72);
    } else {
      myHeroImage = new PositionedImage("assets/hero-down.png", myHero.positionX * 72, myHero.positionY * 72);
    }
    myHeroImage.draw(graphics);

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
}
