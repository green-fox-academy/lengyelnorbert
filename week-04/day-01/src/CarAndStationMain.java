
public class CarAndStationMain {

  public static void main(String[] args) {
    Car myTrabant = new Car();
    Station molStation = new Station();

    System.out.println("myT cap: " + myTrabant.capacity + " myT gas: " + myTrabant.gasAmount);
    System.out.println("molS gas: " + molStation.gasAmount);

    molStation.refill(myTrabant);

    System.out.println("myT cap: " + myTrabant.capacity + " myT gas: " + myTrabant.gasAmount);
    System.out.println("molS gas: " + molStation.gasAmount);


  }

}


