package reservation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {


  @Override
  public String getDowBooking() {
    List<String> dayOfWeek = Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");
    return randomGenerator(1, dayOfWeek);
  }

  @Override
  public String getCodeBooking() {
    List<String> bookingID = Arrays
            .asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
                    "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                    "W", "X", "Y", "Z");
    return randomGenerator(8, bookingID);
  }

  @Override
  public String toString() {
    return null;
  }

  String randomGenerator(int amountToRandomize, List<String> stringToGetRandomElementFrom){
    String stringToReturn = null;
    for (int i = 0; i < amountToRandomize; i++) {
      int randomIndex = new Random().nextInt(stringToGetRandomElementFrom.size());
      stringToReturn += stringToGetRandomElementFrom.get(randomIndex);
    }
    return stringToReturn;
  }
}
