package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
    sound = "Twang";
  }

  public ElectricGuitar(int numberOfStrings) {
    name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
    sound = "Twang";
  }
}
