package reservation;


public class ReservationApp {

  public static void main(String[] args) {
    createReservation(8);
  }

  static void createReservation(int thisAmount){
    for (int i = 0; i < thisAmount; i++) {
      Reservation newRezi = new Reservation();
      System.out.println(newRezi);
    }
  }
}
