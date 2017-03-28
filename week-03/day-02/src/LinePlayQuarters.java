import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics){
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

    for (int i = 0; i < 320; i+=25) {
      graphics.setColor(new Color(128, 0, 128));
      graphics.drawLine(i, 0, 320, i+25);
      graphics.setColor(new Color(0, 255, 0));
      graphics.drawLine(0, i, i+25, 320);
      graphics.setColor(new Color(255, 0, 0));
      graphics.drawLine(0, 320-i, i+25, 0);
      graphics.setColor(new Color(0, 0, 255));
      graphics.drawLine(i, 320, 320, 320-i);
    }

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