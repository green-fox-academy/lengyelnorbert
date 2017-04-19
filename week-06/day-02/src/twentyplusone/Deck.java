package twentyplusone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

  List<Card> deck;

  Deck(int howManyDecksYouWishToPlayWith) {
    deck = new ArrayList<>();
    buildDeck(howManyDecksYouWishToPlayWith);
  }

  public void buildDeck(int howManyDecksYouWishToPlayWith) {
    for (int i = 0; i < howManyDecksYouWishToPlayWith; i++) {
      for (int j = 0; j < Suit.values().length; j++) {
        for (int k = 0; k < Rank.values().length; k++) {
          Card newCard = new Card(Suit.values()[j], Rank.values()[k]);
          deck.add(newCard);
        }
      }
    }
  }

  public void shuffle(){
    System.out.println("Shuffling...");
    Collections.shuffle(deck);
  }

  public void pullFirst(){
    System.out.println("Pulling the first card... ");
    Card pulledCard = deck.get(0);
    System.out.println(pulledCard);
    deck.remove(0);
  }

  public void pullLast(){
    System.out.println("Pulling the last card... ");
    Card pulledCard = deck.get(deck.size()-1);
    System.out.println(pulledCard);
    deck.remove(deck.size()-1);
  }

  public int pullRandom(){
    System.out.println("Pulling random card... ");
    int randomCard = (int) (Math.random() * deck.size());
    Card pulledCard = deck.get(randomCard);
    int pulledCardValue = pulledCard.rank.getCardValue();
    System.out.println(pulledCard);
    deck.remove(randomCard);
    return pulledCardValue;
  }

  @Override
  public String toString() {
    String returnString = "This deck contains " + deck.size() + " card(s)... Detailed list: ";
    for (Card card : deck) {
      returnString += card.toString() + " | ";
    }
    return  returnString + "\n";
  }
}
