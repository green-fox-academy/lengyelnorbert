package ScrumGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {

  int myHeroX;
  int myHeroY;

  public Board() {
    myHeroX = 0;
    myHeroY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    Tile tile = new Tile();
    tile.buildTheOriginalMap(graphics);

    PositionedImage myHeroImage = new PositionedImage("assets/hero-down.png", myHeroX, myHeroY);
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
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      myHeroY -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      myHeroY += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      myHeroX -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      myHeroX += 72;
    }
    repaint();
  }
}