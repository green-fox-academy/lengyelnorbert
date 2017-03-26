import java.util.Scanner;


public class GuessMyNumber {

  public static void main(String[] args) {
    System.out
            .print("Tell me which range you wish to guess. Give me the lowest possible value, no smaller that zero ");
    Scanner scanner = new Scanner(System.in);
    int lowerEnd = scanner.nextInt();
    System.out.print("Give me the highest value, no higher than a million: ");
    int higherEnd = scanner.nextInt();
    System.out.print("And how many lives would you like to have? ");
    int lives = scanner.nextInt();

    int autRandomNum = lowerEnd + (int) (Math.random() * higherEnd);

    System.out.println("The random number for testing purposes only (" + autRandomNum + ")");

    while (lives > 0) {
      System.out
              .println(
                      "So what is your best guess now... As we all know, the number should somewhere between "
                              + lowerEnd + " and " + higherEnd);
      int guess = scanner.nextInt();
      if (guess == autRandomNum) {
        System.out.println("You won, and you had " + lives + " lives left...");
        System.exit(0);
      } else if (guess > autRandomNum) {
        lives = lives - 1;
        System.out.println("The number is smaller... You have " + lives + " lives remaining");
        if (guess > higherEnd) {
          System.out.println("By the way, your guess was out of the range you set up");
        } else {
          higherEnd = guess;
        }
      } else if (guess < autRandomNum) {
        lives = lives - 1;
        System.out.println("The number is bigger...You have " + lives + " lives remaining");
        if (guess < lowerEnd) {
          System.out.println("By the way, your guess was out of the range you set up");
        } else {
          lowerEnd = guess;
        }
      }
    }
    System.out.println("Well, maybe next time...");
    System.exit(0);
  }
}









