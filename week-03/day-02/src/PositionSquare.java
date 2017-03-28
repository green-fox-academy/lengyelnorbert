import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.

    int[] boxTopLeft = new int[2];
    for (int i = 0; i < 3; i++) {
      boxTopLeft = UserInput();
      if (boxTopLeft[0]>250 || boxTopLeft[1]>250){
        System.out.println("It would be out of the canvas, pls, give smaller number than 251: ");
        i--;
      }
      else {
        graphics.fillRect(boxTopLeft[0], boxTopLeft[1], 50, 50);
      }
    }

  }

  public static int[] UserInput() {
    int xcord, ycord = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Pls, give me the box's top left corner \"x\" coordinate: ");
    xcord = scanner.nextInt();
    System.out.printf("Pls, give me the box's top left corner \"y\" coordinate: ");
    ycord = scanner.nextInt();
    int[] coords = {xcord, ycord};
    return coords;


  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
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