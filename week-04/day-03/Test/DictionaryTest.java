import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;


class DictionaryTest {


  @Test
  public void dicTest() throws Exception {
    Dictionary dicTest = new Dictionary();
    String message = "kkkmm";
    System.out.println(dicTest.dictonary(message));
    HashMap<Character, Integer> testMap = new HashMap<>();
    testMap.put('k', 3);
    testMap.put('m', 2);
    assertEquals(testMap, dicTest.dictonary(message));




  }
}