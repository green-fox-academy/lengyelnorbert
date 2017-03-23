import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    System.out
            .print("Type in a text pls, and I will tell you if it is a palindrome or not. Your text to check is:");

    Scanner scanner = new Scanner(System.in);
    String textToCheck = scanner.nextLine();

    palindrom(textToCheck);

  }

  public static void palindrom(String isItPalindrom) {
    isItPalindrom = isItPalindrom.toLowerCase();
    String wordbackwords = "";
    for (int i = isItPalindrom.length(); i > 0; i--) {
      wordbackwords = wordbackwords + isItPalindrom.charAt(i - 1);
      System.out.println(wordbackwords);
    }
    System.out.println("Your original word was:" + isItPalindrom);
    System.out.println("Your original word backwards is :" + wordbackwords);


    if (wordbackwords.equals(isItPalindrom)) {
      System.out.print("So it is a palindrom");
    } else {
      System.out.print(" So it is NOT a palindrom");
    }

  }


}


