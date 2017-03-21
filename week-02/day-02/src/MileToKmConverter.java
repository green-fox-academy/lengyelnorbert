import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a length in kilometers, and I will tell you the figure in miles");
    int figuresInKilometer = scanner.nextInt();
    double figuresInMiles = 0.621371 * figuresInKilometer;
    System.out.println("The figure what you gave me in kilometers is equal to " + figuresInMiles + " miles");
  }
}