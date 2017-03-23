import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
public class DrawPyramid {

  public static void main(String[] args) {


//    Scanner thisInput = new Scanner(System.in);
//    System.out.println("Tell me pls how high the pyramid should be:");
//    int pyramidHeight = thisInput.nextInt();

    int pyramidHeight = 3;

    for (int row = 0; row <= pyramidHeight; row++){
      System.out.println();
      for (int whspace = pyramidHeight - row; whspace > 0; whspace--){
        System.out.print(" ");
      }
      for (int asterix = 0; asterix <= (row*2-1); asterix++){
        System.out.print("*");
      }


    }



  }
}
