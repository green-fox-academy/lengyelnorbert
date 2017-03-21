import java.util.Scanner;

// Create a program that asks for a number and prints the multiplication table with that number
//
public class MultiplicationTable {

  public static void main(String[] args) {

    Scanner thisInput = new Scanner(System.in);
    System.out.println("Give me the number you wish to multiply:");
    int theNumber = thisInput.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " * " + theNumber + " = " + i * theNumber);

    }

  }
}



