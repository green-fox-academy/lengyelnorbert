package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    name = "Violin";
    numberOfStrings = 4;
    sound = "Screech";
  }

  public Violin(int numberOfStrings) {
    name = "Violin";
    this.numberOfStrings = numberOfStrings;
    sound = "Screech";
  }
}
