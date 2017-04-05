import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppleTest {


  @Test
  public void getApple() throws Exception {
    Apple apple = new Apple();
    assertEquals("apple", apple.getApple());

  }
}




