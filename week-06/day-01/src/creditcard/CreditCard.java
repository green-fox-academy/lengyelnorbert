package creditcard;

import java.util.Random;

public class CreditCard implements CreditCardy {

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
    return String
            .format("Name=%s CC#=%s CVV=%d (validated)", getNameCardholder(), codeAcc,
                    cumeSumCVV(codeAcc));
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
}


