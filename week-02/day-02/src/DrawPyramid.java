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


    Scanner thisInput = new Scanner(System.in);
    System.out.println("Tell me pls how high the pyramid should be:");
    int pyramidHeight = thisInput.nextInt();

//    int pyramidHeight = 6;

    for (int row = 0; row <= pyramidHeight-1; row++){
      System.out.println();
      for (int whspace = pyramidHeight - row; whspace > 0; whspace--){
        System.out.print(" ");
      }
      for (int asterix = 0; asterix <= (row*2); asterix++){
        System.out.print("*");
      }


    }



  }
}
