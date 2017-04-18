package main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;
  final String formatOfPlay = "%s, a %d-stringed instrument that %s\n";
  String sound;

  @Override
  public void play() {
    super.play();
    System.out.printf(formatOfPlay, name, numberOfStrings, sound);
  }
}
