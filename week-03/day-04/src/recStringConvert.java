// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
public class recStringConvert {

  public static void main(String[] args) {

    String toConvert = "change the x and the xxxx in this text to y, xx xxxx";
    String finalStrint = textConverter(toConvert, 0);
    System.out.println(finalStrint);

  }

  public static String textConverter(String toConv, int n) {
    if (n == toConv.length()) {
      return "";
    } else if (toConv.charAt(n) == 'x') {
      return 'y' + textConverter(toConv, ++n);
    } else {
      return toConv.charAt(n) + textConverter(toConv, ++n);
    }

  }


}


