import java.awt.List;
import java.util.*;
import javax.lang.model.element.Element;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.

    int[] squaresizehere = userInput();
    for (int i = 0; i < 3; i++) {
      drawSquares(graphics, squaresizehere[i]);
    }




  }

  public static void drawSquares (Graphics graphics, int squareSize){

    graphics.drawRect(160-squareSize/2, 171-squareSize/2, squareSize, squareSize);


  }

  public static int[] userInput(){
    Scanner scanner = new Scanner(System.in);
    int size = 0;
    int[] squaresSizes = new int[3];
    for (int i = 1; i < 4; i++) {
      System.out.println("I'm asking for 3 square size, now give me a size for square number " +i+ ": ");
      size = scanner.nextInt();
      squaresSizes[i-1] = size;
    }
    return squaresSizes;

  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
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