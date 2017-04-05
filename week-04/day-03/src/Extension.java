import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import javax.management.StringValueExp;


public class Extension {


  int add(int a, int b) {
    int c = a + b;
    return c;
  }

  int maxOfThree(int a, int b, int c) {
    int[] input = {a, b, c};
    Arrays.sort(input);
    return input[2];
  }

  int median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 0) {
      int thisMed = (pool.get(pool.size() / 2) + pool.get(pool.size() / 2 - 1)) / 2;
      return thisMed;
    } else {
      return pool.get((pool.size() / 2));
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
}
