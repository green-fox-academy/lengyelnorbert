import java.util.HashMap;

public class Dictionary {
  String textToCheck;

  public Dictionary() {
  }

//  public static void main(String[] args) {
//    Dictionary dicc = new Dictionary();
//    HashMap check = dicc.dictonary("Hahaha");
//    System.out.println(check);
//  }


  public HashMap<Character, Integer> dictonary(String textIn){
    HashMap<Character, Integer> dict = new HashMap<>();
    textToCheck = textIn;
    textToCheck = textToCheck.toLowerCase();
    textToCheck = textToCheck.replaceAll("[^a-z]", "");
    for(int j=0; j<textToCheck.length(); j++){
      if (dict.containsKey(textToCheck.charAt(j)))  {
        dict.put(textToCheck.charAt(j), dict.get(textToCheck.charAt(j))+1);
      }else {
        dict.put(textToCheck.charAt(j), 1);
      }
    }
    return dict;

  }

}



