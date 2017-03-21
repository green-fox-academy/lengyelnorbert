import java.util.Scanner;

public class fiveintegers {
  public static void main(String[] args) {

   int numbersSum = 0;
   double numbersAverage = 0.;

    Scanner xxx = new Scanner(System.in);
    System.out.println("I will be asking for 5 integers, and after that I will let you know how much the SUM and the AVERAGE of them... So please give me the first integer:");
    int firstNumber = xxx.nextInt();

    System.out.println("Please give me the second integer:");
    int secondNumber = xxx.nextInt();

    System.out.println("Please give me the third integer:");
    int thirdNumber = xxx.nextInt();

    Scanner scanner4 = new Scanner(System.in);
    System.out.println("Please give me the fourth integer:");
    int fourthNumber = xxx.nextInt();

    Scanner scanner5 = new Scanner(System.in);
    System.out.println("Please give me the fivth integer:");
    int fifthNumber = xxx.nextInt();

    numbersSum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
    numbersAverage = numbersSum / 5;

    System.out.println("By now I can tell you that the SUM of your 5 figures is " + numbersSum + ", while the average of them is " + numbersAverage);
  }
}



// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

