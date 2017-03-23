import java.util.*;

// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place //What I cannot create, I do not understand
// Your task is to fix it by swapping the right words with code

// Also, print the sentence to the output with spaces in between.

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    int[] correctOrder = {0, 1, 5, 3, 4, 2, 6, 7};
    ArrayList<String> correctList = new ArrayList<>();

    for (int i=0; i<correctOrder.length; i++){
      correctList.add(list.get(correctOrder[i]));

    }

    String listString = "";

    for (String s : correctList)
    {
      listString += s + " ";
    }

    System.out.println(listString);
  }
}