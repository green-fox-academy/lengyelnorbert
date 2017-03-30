// Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class recStringXRemove {


  public static void main(String[] args) {

    String origS = "From this text should xxx xxx xxx removed from";
    String finalS = stringRemo(origS, 0);
    System.out.println(finalS);

  }

  public static String stringRemo(String origText, int n) {
    if (n == origText.length()) {
      return "";
    } else if (origText.charAt(n) == 'x') {
      return "" + (stringRemo(origText, ++n));

    } else {
      return origText.charAt(n) + (stringRemo(origText, ++n));
    }


  }

}
