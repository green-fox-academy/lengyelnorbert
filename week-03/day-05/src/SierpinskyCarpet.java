import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

  public static void mainDraw(Graphics graphics){
    int canvasSize = 600;
    int boxSize = canvasSize/3;

    fract(boxSize, boxSize, boxSize,  graphics);
  }

  public static void fract (int startX, int startY, int boxSize, Graphics graphics){
    if (boxSize < 1){
      return;
    }
    else{
      int r = (int) (Math.random() * 255);
      int g = (int) (Math.random() * 255);
      int b = (int) (Math.random() * 255);
      graphics.setColor(new Color(r, g, b));
      drawBlackSquare(startX, startY, boxSize, graphics);
      fract(startX-boxSize/3*2, startY-boxSize/3*2, boxSize/3,  graphics);
      fract(startX+boxSize/3, startY-boxSize/3*2, boxSize/3, graphics);
      fract(startX+boxSize+boxSize/3, startY-boxSize/3*2, boxSize/3,  graphics);
      fract(startX-boxSize/3*2, startY+boxSize+boxSize/3, boxSize/3,  graphics);
      fract(startX+boxSize/3, startY+boxSize+boxSize/3, boxSize/3, graphics);
      fract(startX+boxSize+boxSize/3, startY+boxSize+boxSize/3, boxSize/3,  graphics);
      fract(startX-boxSize/3*2, startY+boxSize/3, boxSize/3,  graphics);
      fract(startX+ boxSize +boxSize/3, startY+boxSize/3, boxSize/3,  graphics);
    }

  }

  public static void drawBlackSquare(int startX, int startY, int boxSize, Graphics graphics){
    graphics.fillRect(startX, startY, boxSize, boxSize);
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

  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}