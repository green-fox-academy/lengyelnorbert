import java.util.Scanner;

public class CountFromTo {

  // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
  public static void main(String[] args) {

    Scanner thisInput = new Scanner(System.in);
    System.out.println("Give me the first number pls:");
    int firstNumber = thisInput.nextInt();

    System.out.println("Give me the second number pls:");
    int secondNumber = thisInput.nextInt();

    if (secondNumber <= firstNumber) {
      System.out.println("The second number should be bigger");
    } else {
      for (int i = firstNumber; i <= secondNumber; i++) {
        System.out.println(i);
      }
    }

  }
}


