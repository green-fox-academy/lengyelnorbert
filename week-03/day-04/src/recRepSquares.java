import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class recRepSquares {

  public static void mainDraw(Graphics graphics){

    int sizeToDived = 300;
    recDraw(graphics, sizeToDived);



  }
  public static void recDraw (Graphics graphics, int sizeToDived){
    if (sizeToDived < 3){
      return;
    }
    else{
      graphics.drawLine();
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.yellow);
      mainDraw(graphics);

    }
  }

}