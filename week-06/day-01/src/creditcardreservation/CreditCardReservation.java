package creditcardreservation;


import creditcard.CreditCardy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import reservation.Reservationy;

public class CreditCardReservation implements CreditCardy, Reservationy {

  static int counter;


  @Override
  public int getSumCVV() {
    return 0;
  }

  @Override
  public String getNameCardholder() {
    String returnString = "ABC";
    returnString = returnString.concat(String.valueOf(counter));
    counter++;
    return returnString;
  }


  @Override
  public String getCodeAccount() {
    return getRandomCreditCardNumber();
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    int sumCVV = 0;
    for (int i = 0; i < codeAccount.length(); i++) {
      sumCVV += Character.getNumericValue(codeAccount.charAt(i));
    }
    return sumCVV;
  }

  @Override
  public String toString() {

    String codeAcc = getCodeAccount();
    return String.format("Booking# %s for %s paid by Name=%s CC#=%s CVV=%d ", getCodeBooking(),
            getDowBooking(), getNameCardholder(), codeAcc, cumeSumCVV(codeAcc));
  }

  String getRandomCreditCardNumber() {
    String randomCCNumber = "";
    for (int i = 0; i < 16; i++) {
      randomCCNumber += String.valueOf(new Random().nextInt(10));
      if (i == 0 && Integer.parseInt(randomCCNumber) == 0) {
        randomCCNumber = "";
        randomCCNumber += String.valueOf(new Random().nextInt(9) + 1);
      }
    }
    return randomCCNumber;
  }

  @Override
  public String getDowBooking() {
    List<String> dayOfWeek = Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");
    return randomGenerator(1, dayOfWeek);
  }

  @Override
  public String getCodeBooking() {
    List<String> bookingID = Arrays
            .asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E",
                    "F",
                    "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
                    "V",
                    "W", "X", "Y", "Z");
    return randomGenerator(8, bookingID);
  }

  String randomGenerator(int amountToRandomize, List<String> stringToGetRandomElementFrom) {
    String stringToReturn = "";
    for (int i = 0; i < amountToRandomize; i++) {
      int randomIndex = new Random().nextInt(stringToGetRandomElementFrom.size());
      stringToReturn += stringToGetRandomElementFrom.get(randomIndex);
    }
    return stringToReturn;
  }
}
