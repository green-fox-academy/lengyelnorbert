import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNights {

  public static void mainDraw(Graphics graphics) {
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)

    int starNumber = 25;
    drawStart(graphics, starNumber);

  }

  public static void drawStart(Graphics graphics, int numbers) {

    int shadeRandom, placeRandomx, placeRandomy = 0;
    for (int i = 0; i < numbers; i++) {
      shadeRandom = (int) (Math.random() * 255);
      graphics.setColor(new Color(shadeRandom, shadeRandom, shadeRandom));
      placeRandomx = (int) (Math.random() * 310);
      placeRandomy = (int) (Math.random() * 310);
      graphics.fillRect(placeRandomx, placeRandomy, 10, 10);
    }


  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 320));
    jFrame.setBackground(new Color(0, 0, 0));
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