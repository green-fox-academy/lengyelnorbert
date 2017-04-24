package twentyplusone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

  static int playersCardValue;
  static int dealersCardValue;
  static boolean isGameRunning = true;
  static Deck newDeck;


  public static void main(String[] args) {

    gameInitialSetup();
    gameRun();
  }

  public static void gameInitialSetup() {
    newDeck = new Deck(1);
    System.out.println(newDeck);

    dealersCardValue = randomNumberForTheDealer();
    System.out.println("Dealer stands on:" + dealersCardValue);

    playersCardValue += newDeck.pullRandom();
    playersCardValue += newDeck.pullRandom();

    System.out.println(playersCardValue);
  }

  public static void gameRun() {
    while (isGameRunning) {
      System.out.println(
              "Dealers cards value: " + dealersCardValue + " Your cards value: " + playersCardValue
                      + " Would you like to play (yes / no)");
      Scanner scanner = new Scanner(System.in);
      try {
        String userInput = scanner.nextLine();
        if (userInput.toLowerCase().equals("yes")) {
          playersCardValue += newDeck.pullRandom();
          userCardValueStillValid();
        } else if (userInput.toLowerCase().equals("no")) {
          userFinishedCheckTheCards();
        } else {
          System.out.println("I don't understand you... Try it again pls");
        }
      } catch (InputMismatchException e) {
        System.out.println("Wrong answer, please try it again");
        gameRun();
      }
    }
  }

  public static int randomNumberForTheDealer() {
    dealersCardValue = (int) ((Math.random() * 7) + 15);
    return dealersCardValue;
  }

  public static void userCardValueStillValid() {
    if (playersCardValue > 21) {
      System.out.println("Too much...");
      isGameRunning = false;
    }
  }

  public static void userFinishedCheckTheCards() {
    if (playersCardValue > dealersCardValue) {
      System.out.println("you won!");
      isGameRunning = false;
    } else if (playersCardValue == dealersCardValue) {
      System.out.println("draw");
      isGameRunning = false;
    } else {
      System.out.println("oh-oh... not enough...");
      isGameRunning = false;
    }
  }
}
