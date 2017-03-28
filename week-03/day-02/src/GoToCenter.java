import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

public class GoToCenter {

  public static void mainDraw(Graphics graphics) {
    int[] drawFrom = {0, 0};
    for (int i = 0; i < 3; i++) {
      drawFrom = userInput();
      graphics.drawLine(drawFrom[0], drawFrom[1], 150, 150);
    }

    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.

  }

  public static int[] userInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me the \"x\" coordinate figure: ");
    int xcord = scanner.nextInt();
    System.out.println("Please give me the \"y\" coordinate figure: ");
    int ycord = scanner.nextInt();
    int[] coords = {xcord, ycord};
    return coords;
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

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}