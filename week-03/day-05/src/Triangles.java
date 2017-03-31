import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics) {

    int canSize = 400;
    int triH = canSize / 2;
    int mX = canSize / 2;
    int mY = canSize / 4;
    fract(mX, mY, triH, graphics);

  }

  public static void drawTriangle(int mX, int mY, int triH, Graphics graphics) {
    graphics.drawLine(mX, mY-triH/2, mX + triH / 2, mY + triH / 2);
    graphics.drawLine(mX, mY-triH/2, mX - triH / 2, mY + triH / 2);
    graphics.drawLine(mX + triH / 2, mY + triH / 2, mX - triH / 2, mY + triH / 2);
  }
  public static void fract(int mX, int mY, int triH, Graphics graphics){
    if (triH<4){
      return;
    }
    else {
      drawTriangle(mX, mY, triH, graphics);
      fract(mX-triH/2, mY-triH/4, triH/2, graphics);
      fract(mX+triH/2, mY-triH/4, triH/2, graphics);
      fract(mX, mY+triH/4*3, triH/2, graphics);
    }

  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

