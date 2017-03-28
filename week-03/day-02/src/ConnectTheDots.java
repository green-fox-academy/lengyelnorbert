
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics) {
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    int[][] listOne = {{10, 10}, {290, 10}, {290, 290}, {10, 290}, {10, 10}};
    int[][] listTwo = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130},
            {50, 100}};

    connectLines(graphics, listOne);
    connectLines(graphics, listTwo);
  }

  public static void connectLines(Graphics graphics, int[][] toConnect) {
    for (int i = 0; i < toConnect.length - 1; i++) {
      graphics.drawLine(toConnect[i][0], toConnect[i][1], toConnect[i + 1][0], toConnect[i + 1][1]);
    }

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

// create a 300x300 canvas.