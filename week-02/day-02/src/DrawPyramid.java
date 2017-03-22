import java.util.Scanner;
import oracle.jrockit.jfr.StringConstantPool;

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
    System.out.println("How high the pyramid should be? Give me the number pls:");
    int starsNumber = thisInput.nextInt();

