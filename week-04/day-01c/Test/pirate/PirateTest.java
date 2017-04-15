package pirate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PirateTest {

  @Test
  void howsItGoingMate() {
    Pirate newPirate = new Pirate();
    String expected = "Pour me anudder!";
    assertEquals(expected, newPirate.howsItGoingMate());
  }

  @Test
  void die() {

  }

}