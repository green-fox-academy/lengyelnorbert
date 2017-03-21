import java.util.Scanner;

public class AnimalsAndLegs {

  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have
    int totallegs = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hey, Farmer! How many chickens do you have?");
    int chickenNumber = scanner.nextInt();
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("That is cool... And how many pigs do you have?");
    int pigNumber = scanner2.nextInt();
    totallegs = (chickenNumber * 2) + (pigNumber * 4);
    System.out.println("I can tell you, that your chickens and pigs together have " + totallegs
            + " legs... You are welcomed!");
  }
}

