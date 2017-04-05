import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AnagramTest {

  @Test
  public void testAnagram() throws Exception{
    Anagram newAnagram = new Anagram();
    assertTrue(newAnagram.isAnagram("alma", "alma"));
  }

  @Test
  public void testAnagram2() throws Exception{
    Anagram newAnagram = new Anagram();
    assertTrue(newAnagram.isAnagram("alma", "mala"));
  }

  @Test
  public void testAnagram3() throws Exception{
    Anagram newAnagram = new Anagram();
    assertFalse(newAnagram.isAnagram("alma", "kort"));
  }
}
