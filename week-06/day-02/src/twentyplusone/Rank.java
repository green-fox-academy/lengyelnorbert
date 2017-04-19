package twentyplusone;

public enum Rank {
  ONE (1, "Ace"),
  TWO (2, "Deuce"),
  THREE (3, "3"),
  FOUR (4, "4"),
  FIVE (5, "5"),
  SIX (6, "6"),
  SEVEN (7, "7"),
  EIGHT (8, "8"),
  NINE (9, "9"),
  TEN (10, "10"),
  ELEVEN (10, "JACK"),
  TWELVE (10, "QUEEN"),
  THIRTEEN (10, "KING");

  private final int cardValue;
  private final String cardValueString;

  Rank(int cardValue, String cardValueString){
    this.cardValue = cardValue;
    this.cardValueString = cardValueString;
  }

  public int getCardValue() {
    return cardValue;
  }

  public String getCardValueString() {
    return cardValueString;
  }
}
