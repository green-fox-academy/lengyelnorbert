package twentyplusone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

  int playersCardValue;
  int dealersCardValue;



  public static void main(String[] args) {

    Deck newDeck = new Deck(1);
    System.out.println(newDeck);

    


  }


  public boolean doesTheUserWantToPlay(int dealersCardValue, int playersFirstTwoCardsValue) {
    System.out.println(
            "Dealers cards value: " + dealersCardValue + ". Your first two cards value: "
                    + playersFirstTwoCardsValue + " Would you like to play (yes / no)");
    Scanner scanner = new Scanner(System.in);
    try {
      String userInput = scanner.nextLine();
      if (userInput.toLowerCase().equals("yes")) {
        return true;
      } else if (userInput.toLowerCase().equals("no")) {
        return false;
      } else {
        System.out.println("I don't understand you... Try it again pls");
        doesTheUserWantToPlay(dealersCardValue, playersFirstTwoCardsValue);
      }
    } catch (InputMismatchException e) {
      System.out.println("Wrong answer, please try it again");
      doesTheUserWantToPlay(dealersCardValue, playersFirstTwoCardsValue);
    }
    return false;
  }

  public int randomNumberForTheDealer() {
    dealersCardValue = (int) ((Math.random() * 7) + 15);
    return dealersCardValue;
  }

  public int randomCardForThePlayer(){

  }

//  public void pullingCardsForTestin(Deck newDeck) {
//    int counter = 0;
//
//    newDeck.shuffle();
//    System.out.println(newDeck);
//    newDeck.pullFirst();
//    System.out.println(newDeck);
//    newDeck.pullLast();
//    System.out.println(newDeck);
//
//    while (newDeck.deck.size() > 0) {
//      System.out.println(counter++);
//      newDeck.pullRandom();
//      System.out.println(newDeck);
//
//    }
//  }
}
