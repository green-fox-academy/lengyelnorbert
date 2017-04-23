package creditcard;


public class CreditCardApp {

  public static void main(String[] args) {

    for (int i = 0; i < 90; i++) {
      CreditCard newCard = new CreditCard();
      System.out.println(newCard.toString());
    }
  }
}
