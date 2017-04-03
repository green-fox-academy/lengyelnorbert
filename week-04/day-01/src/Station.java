

public class Station {

  int gasAmount = 500;

  public void refill (Car auto){
    gasAmount = gasAmount - auto.capacity;
    auto.gasAmount = auto.capacity;
  }

}
