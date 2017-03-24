import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {

    System.out.println("Type your first text pls:");
    Scanner scanner = new Scanner(System.in);
    String text1 = scanner.nextLine();
    System.out.println("Type your second text pls:");
    String text2 = scanner.nextLine();

    isAnagram(text1, text2);
  }


  static void isAnagram(String text1, String text2) {
    String text1Clear = text1.replaceAll("\\s", "");
    String text2Clear = text2.replaceAll("\\s", "");
    boolean status = true;

    if (text1Clear.length() != text2Clear.length()) {
      status = false;
    } else {
      char[] text1Array = text1Clear.toLowerCase().toCharArray();
      char[] text2Array = text2Clear.toLowerCase().toCharArray();

      Arrays.sort(text1Array);
      Arrays.sort(text2Array);
      status = Arrays.equals(text1Array, text2Array);
    }

    if (status) {
      System.out.println(text1 + " and " + text2 + " are anagrams");
    } else {
      System.out.println(text1 + " and " + text2 + " are not anagrams");
    }
  }
}


