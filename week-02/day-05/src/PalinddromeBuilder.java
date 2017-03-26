import java.util.Scanner;


public class PalinddromeBuilder {

  public static void main(String[] args) {

    String userText = UserInPut1();
    System.out.print(userText);

    String reverseText = ReverseFunction(userText);
    System.out.print(reverseText);


  }
  public static String UserInPut1 (){
    System.out.print("Type in the text to reverse pls: ");
    Scanner llii = new Scanner(System.in);
    String userText = llii.nextLine();
    return userText;
  }

  public static String ReverseFunction (String akarmi){

//    String reverse = "fadfa";
    String reverse = new StringBuilder(akarmi).reverse().toString();
    return reverse;
  }




}
