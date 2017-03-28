import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionCenter {

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    int[] coordinates = userInput();
    graphics.drawLine(coordinates[0], coordinates[1], 160, 170);

    for (int i = 0; i <= 320 ; i += 20) {
      graphics.drawLine(i, 0, 160, 170);
      graphics.drawLine(i, 340, 160, 170);
    }
    for (int i = 0; i <= 340 ; i += 20) {
      graphics.drawLine(0, i, 160, 170);
      graphics.drawLine(320, i, 160, 170);
    }

  }

  public static int[] userInput(){
    int x, y = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Pls, give me a starting x and y coordinates of the line: ");
    x = scanner.nextInt();
    y = scanner.nextInt();
    int[] coords = {x, y};
    return coords;



  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 340));
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