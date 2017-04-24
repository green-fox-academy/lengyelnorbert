package twentyplusone;

public class Card {

  Color color;
  Suit suit;
  Rank rank;

  Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
    if (suit == Suit.CLUBS || suit == Suit.SPADES) {
      color = Color.BLACK;
    }
    if (suit == Suit.DIAMONDS || suit == Suit.HEARTS) {
      color = Color.RED;
    }
  }

  @Override
  public String toString() {
    return rank.getCardValueString() + "-" + suit;
  }
}
