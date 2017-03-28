import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    int middleBoxsize = Userinput();
    System.out.println(middleBoxsize);

    drawBoxes(graphics, middleBoxsize);

  }

  public static void drawBoxes(Graphics graphics, int middleBox) {
    int r, g, b = 0;
    for (int i = 0; i < (int)(160 - middleBox / 2); i += 5) {

      r = (int) (Math.random() * 255);
      g = (int) (Math.random() * 255);
      b = (int) (Math.random() * 255);
      graphics.setColor(new Color(r, g, b));
      graphics.fillRect(i, i, 320 - 2*i, 320 - 2*i);

    }


  }

  public static int Userinput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pls, specify the middle box size");
    int boxsize = scanner.nextInt();
    scanner.close();
    return boxsize;
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(340, 363));
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