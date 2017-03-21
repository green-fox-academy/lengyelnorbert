import java.util.Scanner;

// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
public class PartiIndicator {

  public static void main(String[] args) {
    Scanner thisInput = new Scanner(System.in);

    System.out.println("Give me the number of the girls in the party, pls:");
    int girlsNumber = thisInput.nextInt();
    System.out.println("Give me the number of the boys in the party, pls:");
    int boysNumber = thisInput.nextInt();

    if (girlsNumber == 0) {
      System.out.println("Sausage party");
    }
    else if ((girlsNumber == boysNumber) && ((girlsNumber + boysNumber) > 20)) {
      System.out.println("The party is exellent!");
    } else if ((girlsNumber + boysNumber) > 20) {
      System.out.println("Quite cool party!");
    } else if ((girlsNumber + boysNumber) < 20) {
      System.out.println("Average party...");
    } else {
      System.out.println("20 people coming, this option was not specified in the exercise");
    }
  }

}
