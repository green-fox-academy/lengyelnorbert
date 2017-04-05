import java.util.Scanner;

/**
 * Created by kispista on 2017.04.05..
 */
public class CowAndBull {

  int CurrentBullAmount, CurrentCowAmount, guessesAmount, randomNumberToGuess;
  boolean isGameRunning, isGuessedNumberGood;

  public CowAndBull() {
    randomNumberToGuess = getRandomNumberToGuess();
    guessesAmount = 0;
    isGameRunning = true;
    isGuessedNumberGood = false;
    CurrentBullAmount = 0;
    CurrentCowAmount = 0;

  }

  public int getRandomNumberToGuess() {
    int randomnumber = (int) (Math.random() * 10000);
    String.format("%04d", randomnumber);
    return randomnumber;
  }

  public void printOutTheCurrentResult() {
    System.out.println(
            "Your current Guess was : " + guessesAmount + " At this stage you have: "
                    + CurrentBullAmount
                    + " bulls (good digit, wrong place), and " + CurrentCowAmount
                    + " cows (good digit, right place)");
  }

  public void userInput() {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    if (0 <= userInput && userInput <= 9999 && 4 == String.valueOf(userInput).length()) {
      checkNumberIfItsCorrect(userInput);
    } else {
      System.out.println("Please give a number in 4 digit format between 0 - 9999");
    }
  }

  public void checkNumberIfItsCorrect(int userGuess) {
    if (userGuess == randomNumberToGuess) {
      System.out.println("You won!");
      isGuessedNumberGood = true;
      isGameRunning = false;
    } else {
      printOutTheCurrentResult();

    }

//    return isThisCorrect;

  }

}
