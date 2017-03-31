import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class recRepSquares {



  public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(255, 255, 0, 255));
    graphics.fillRect(0, 0, 600, 600);
    graphics.setColor(new Color(0, 0, 0, 255));
    graphics.drawRect(0, 0, 600, 600);

    fract(0, 0, 300, graphics);


  }
  public static void drawTheLines(int x, int y, int maxLines, Graphics graphics){
    graphics.drawLine(x+maxLines/3, y, x+maxLines/3, y+maxLines);
    graphics.drawLine(x+maxLines/3*2, y, x+maxLines/3*2, y+maxLines);
    graphics.drawLine(x, y+maxLines/3, x+maxLines, y+maxLines/3);
    graphics.drawLine(x, y+maxLines/3*2, x+maxLines, y+maxLines/3*2);



  }
  public static void fract(int x, int y, int maxLines, Graphics graphics){
    if (maxLines < 1){
      return;
    }
    else {
      drawTheLines(x, y, maxLines, graphics);
      fract(x+maxLines/3, y, maxLines/3, graphics);
      fract(x, y+maxLines/3, maxLines/3, graphics);
      fract(x+maxLines/3*2, y+maxLines/3, maxLines/3, graphics);
      fract(x+maxLines/3, y+maxLines/3*2, maxLines/3, graphics);

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

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}