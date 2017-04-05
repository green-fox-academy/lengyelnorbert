import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class FibonacciTest {


  @Test
  void testFibo() {
    Fibonacci testFib = new Fibonacci();
    int result = testFib.fibIndexCounter(4);
    System.out.println(result);
    assertEquals(3, testFib.fibIndexCounter(4));
    assertTrue(3 == testFib.fibIndexCounter(4));
    assertFalse(5 == testFib.fibIndexCounter(4));
  }

  @Test
  void testFibo2() {
    Fibonacci testFib = new Fibonacci();
    int result = testFib.fibIndexCounter(4);
    System.out.println(result);
    assertFalse(5 == testFib.fibIndexCounter(4));
  }

  @Test
  void testFibo3() {
    Fibonacci testFib = new Fibonacci();
    int result = testFib.fibIndexCounter(4);
    System.out.println(result);
    assertTrue(3 == testFib.fibIndexCounter(4));
  }
}