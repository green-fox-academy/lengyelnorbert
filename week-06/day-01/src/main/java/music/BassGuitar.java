package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 4;
    sound = "Duum-duum-duum";
  }

  public BassGuitar(int numberOfStrings) {
    name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
    sound = "Duum-duum-duum";
  }
}
