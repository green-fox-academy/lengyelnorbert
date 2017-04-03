//Create Counter class
//which has an integer field value
//                when creating it should have a default value 0 or we can specify it when creating
//        we can add(number) to this counter another whole number
//        or we can add() without parameters just increasing the counter's value by one
//        and we can get() the current value
//        also we can reset() the value to the initial value
public class Counter {

  int counterValue;
  int givenValue;


  public Counter() {
    counterValue = 0;
  }

  public Counter(int counterValue) {
    this.counterValue = counterValue;
    givenValue = counterValue;
  }

  public void add() {
    counterValue++;
  }

  public void add(int addToCounterValue) {
    counterValue += addToCounterValue;
  }

  public int get() {
    return counterValue;
  }

  public void reset() {
    if (counterValue == givenValue) {
      counterValue = 0;
    }
    counterValue = givenValue;
  }


}