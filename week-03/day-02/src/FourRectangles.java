import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.

    graphics.setColor(new Color(30, 255, 30));
    graphics.fillRect(10, 10, 100, 20);
    graphics.setColor(new Color(255, 255, 30));
    graphics.fillRect(10, 50, 150, 55);
    graphics.setColor(new Color(255, 2, 30));
    graphics.fillRect(100, 100, 60, 200);
    graphics.setColor(new Color(30, 255, 255));
    graphics.fillRect(200, 90, 100, 200);


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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}