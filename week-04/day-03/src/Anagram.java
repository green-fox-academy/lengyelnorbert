import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

  String s1;
  String s2;

  public Anagram() {
  }

  public boolean isAnagram(String firstString, String secondString) {
    s1 = firstString;
    s2 = secondString;
    boolean isAnagram = false;
    if (s1.length() == s2.length()) {
      char[] s1AsC = s1.toCharArray();
      char[] s2AsC = s2.toCharArray();
      Arrays.sort(s1AsC);
      Arrays.sort(s2AsC);
      isAnagram = (Arrays.equals(s1AsC, s2AsC));
    }
    return isAnagram;

  }


}