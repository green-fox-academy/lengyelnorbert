package creditcardreservation;


import java.util.ArrayList;
import java.util.List;

public class CreditCardReservationApp {

  static List<CreditCardReservation> myCCRezList = new ArrayList<>();

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      CreditCardReservation newccrezi = new CreditCardReservation();
      myCCRezList.add(newccrezi);
    }

    for (CreditCardReservation ccrezi : myCCRezList) {
      System.out.println(ccrezi);
    }
  }
}
