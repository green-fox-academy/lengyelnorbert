import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriAngle {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/triangles/r5.png]

    int triAngleSideLength = 40;
    int[] topcord = {160, 30};
    for (int i = 0; i < 160 / triAngleSideLength / 2 ; i += 2) {
      drawTrianlge(graphics, topcord, triAngleSideLength);


    }



  }


  public static int[] drawTrianlge(Graphics graphics, int[] topcoord, int sideLength){
    int[] a, b, c;
    a = topcoord;
    b = new int[]{a[0]+sideLength/2, a[1]+(int)((Math.sqrt(3))/2*sideLength)};
    c = new int[]{a[0]-sideLength/2, a[1]+(int)((Math.sqrt(3))/2*sideLength)};
    graphics.drawLine(a[0], a[1], b[0], b[1]);
    graphics.drawLine(b[0], b[1], c[0], c[1]);
    graphics.drawLine(c[0], c[1], a[0], a[1]);

    return c;



  }




  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 320));
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