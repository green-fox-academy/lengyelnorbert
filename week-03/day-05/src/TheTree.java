import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TheTree {

  public static void mainDraw(Graphics graphics) {
    int canSize = 600;
    int X1 = canSize/2;
    int Y1 = canSize;
    int X2 = canSize/2;
    int Y2 = canSize - canSize/5;
    int depth = 100;

    fract(X1, Y1, X2, Y2, depth, graphics);
  }

  public static void fract (int X1, int Y1, int X2, int Y2, int depth, Graphics graphics){
    if (depth<5){
      return;
    }
    else {
      drawTree(X1, Y1, X2, Y2, graphics);
      fract (X2, Y2, X2-X2/10, Y2-Y2/2 , depth-10, graphics);

    }


  }


  public static void drawTree (int X1, int Y1, int X2, int Y2, Graphics graphics){
    graphics.drawLine(X1, Y1, X2, Y2);
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

