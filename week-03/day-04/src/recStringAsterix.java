// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
public class recStringAsterix {

  public static void main(String[] args) {

    String origText = "This is where all the text should be separated by asterixes";
    System.out.println(withAsterix(origText, 0));
  }

  public static String withAsterix(String oText, int n){
    if (n == oText.length()){
      return "";
    }
    else{
      return oText.charAt(n) + "*" + (withAsterix(oText, ++n));

    }

  }

}
