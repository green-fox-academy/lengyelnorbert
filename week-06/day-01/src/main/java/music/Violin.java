package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    name = "Electric Guitar";
    numberOfStrings = 4;
    sound = "Screech";
  }

  public Violin(int numberOfStrings) {
    name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
    sound = "Screech";
  }
}
