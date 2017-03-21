import java.util.Scanner;
// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

public class ITellYou {

  public static void main(String[] args) {

    Scanner thisInput = new Scanner(System.in);
    System.out.println(
            "Give me a number please, and I will tell you how big it is... So, your number is:");
    int givenNumber = thisInput.nextInt();

    if (givenNumber <= 0) {
      System.out.println("Not enough");
    } else if (givenNumber == 1) {
      System.out.println("One");
    } else if (givenNumber == 2) {
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }
  }
}

