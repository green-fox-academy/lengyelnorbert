import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // draw 3 lines with that function.
    int[] coordsLinesFrom = new int[2];
    for (int i = 0; i < 3; i++) {
      coordsLinesFrom = userInput();
      if (coordsLinesFrom[0] < 150) {
        graphics.drawLine(coordsLinesFrom[0], coordsLinesFrom[1], coordsLinesFrom[0] + 50,
                coordsLinesFrom[1]);
      } else {
        graphics.drawLine(coordsLinesFrom[0], coordsLinesFrom[1], coordsLinesFrom[0] - 50,
                coordsLinesFrom[1]);
      }


    }


  }

  public static int[] userInput() {
    int xcord, ycord = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pls, give me a \"x\" coordinates, not bigger the 300 ");
    xcord = scanner.nextInt();
    System.out.println("Pls, give me a \"x\" coordinates, not bigger the 300 ");
    ycord = scanner.nextInt();
    int[] coords = {xcord, ycord};
    return coords;


  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(350, 350));
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