import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    int coordx = 0;
    int size = 30;
    int x, y = 0;
    for (int i = 0; i < 320; i = i + size * 2) {
      for (x = 0; x < 320; x = x + 2 * size) {
        blackBox(graphics, x, i, size);
        whiteBox(graphics, x + size, i, size);
        whiteBox(graphics, x, i + size, size);
        blackBox(graphics, x + size, i + size, size);
      }
    }
  }


  public static void whiteBox(Graphics graphics, int coordx, int coordy, int size) {
    graphics.setColor(new Color(255, 255, 255));
    graphics.fillRect(coordx, coordy, size, size);
  }

  public static void blackBox(Graphics graphics, int coordx, int coordy, int size) {
    graphics.setColor(new Color(0, 0, 0));
    graphics.fillRect(coordx, coordy, size, size);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}