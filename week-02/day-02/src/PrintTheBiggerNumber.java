import java.util.Scanner;

// Write a program that asks for two numbers and prints the bigger one

public class PrintTheBiggerNumber {

  public static void main(String[] args) {

    Scanner thisInput = new Scanner(System.in);
    System.out.println(
            "Give me two numbers please, and I will tell you which one is the bigger... So, your first number is:");
    int firstNumber = thisInput.nextInt();

    System.out.println("And your second number is:");
    int secondNumber = thisInput.nextInt();

    if (firstNumber > secondNumber) {
      System.out.println(
              "Out of the two given numbers the first one (" + firstNumber + ") is the bigger");
    } else if (firstNumber < secondNumber) {
      System.out.println(
              "Out of the two given numbers the second one (" + secondNumber + ") is the bigger");
    } else {
      System.out.println("The two numbers are equal...");
    }
  }
}



