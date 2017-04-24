package splitstring;

import java.util.Arrays;

public class SplitString {

  static String originalString = "This is the original String";
  static int cutTheStringHere = 15;


  public static void main(String[] args) {
    String[] backString = stringCutter(originalString, cutTheStringHere);
    System.out.println(Arrays.toString(backString));

  }


  public static String[] stringCutter(String originalString, int cutTheStringHere) {
    String[] returnStringArray = new String[2];
    String a;
    String b;
    try {
      a = originalString.substring(0, cutTheStringHere);
      b = originalString.substring(cutTheStringHere);
      returnStringArray[0] = a;
      returnStringArray[1] = b;
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Given index is out of bound");
      System.exit(0);
    }
    return returnStringArray;
  }
}
