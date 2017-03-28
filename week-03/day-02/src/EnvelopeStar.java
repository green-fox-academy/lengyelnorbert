import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/envelope-star/r2.png]

    for (int i = 0; i < 160; i +=5) {
      graphics.setColor(new Color(0, 255, 0));
      graphics.drawLine(i, 160, 160, 160-i);
      graphics.drawLine(i, 160, 160, 160+i);
      graphics.drawLine(320-i, 160, 160, 160-i);
      graphics.drawLine(320-i, 160, 160, 160+i);

    }



  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 320));
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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