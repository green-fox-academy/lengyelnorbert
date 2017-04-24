package calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @org.junit.jupiter.api.Test
  void add() {
    assertEquals(30, Calculator.add(5, 5, 55, -35));
  }

  @org.junit.jupiter.api.Test
  void addWithZero() {
    assertEquals(0, Calculator.add());
  }

  @org.junit.jupiter.api.Test
  void deduct() {
    assertEquals(10, Calculator.deduct(20, 10));
  }

  @org.junit.jupiter.api.Test
  void multiply() {
    assertEquals(50, Calculator.multiply(10, 2, 2.5));
  }

  @org.junit.jupiter.api.Test
  void divide() {
    assertEquals(0, Calculator.divide(0, 0));
  }
}
