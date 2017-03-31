import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {

  public static void mainDraw(Graphics graphics){

    int canvasSize = 300;
    int startX, start =0;
    int lineStrength = 20;
    int boxSize = canvasSize/2;

    fract(boxSize/2, boxSize/2, boxSize, lineStrength, canvasSize, graphics);


  }

  public static void fract (int startX, int startY, int boxSize, int lineStrength, int canvasSize, Graphics graphics){
    if (boxSize < 2){
      return;
    }
    else{
      for (int i = 0; i < lineStrength/2 ; i++) {
        drawBox(startX+i, startY+i, boxSize-i*2, lineStrength, graphics);
        drawBox(startX-i, startY-i, boxSize+i*2, lineStrength, graphics);
      }

      fract(startX-boxSize/4, startY-boxSize/4, boxSize/2, lineStrength/2, canvasSize, graphics);
      fract(canvasSize-(startX+boxSize/4), startY-boxSize/4, boxSize/2, lineStrength/2, canvasSize, graphics);
      fract(startX-boxSize/4, canvasSize -(startY+boxSize/4), boxSize/2, lineStrength/2, canvasSize, graphics);
      fract(canvasSize-(startX+boxSize/4), canvasSize -(startY+boxSize/4), boxSize/2, lineStrength/2, canvasSize, graphics);
    }

  }

  public static void drawBox (int startX, int startY, int boxSize, int lineStrength, Graphics graphics){
    graphics.drawRect(startX, startY, boxSize, boxSize);


  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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