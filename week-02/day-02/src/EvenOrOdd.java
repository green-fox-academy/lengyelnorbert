import java.util.Scanner;

// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.
public class EvenOrOdd {

  public static void main(String[] args) {

    Scanner thisInput = new Scanner(System.in);
    System.out.println(
            "Give me a number please, and I will tell you if it is an odd or an even number... So, your number is:");
    int givenNumber = thisInput.nextInt();

    if (givenNumber % 2 == 0) {
      System.out.println(givenNumber + " is and even number");
    } else {
      System.out.println(givenNumber + " is and odd number");
    }

  }
}
