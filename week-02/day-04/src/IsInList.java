import java.util.*;

// Check if list contains all of the following elements: 4,8,12,16
// Print "true" if it contains all, otherwise print "false"
// Can you do both the different approaches you tried in the previous one?

public class IsInList {

  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    ArrayList<Integer> isThereInside = new ArrayList<>(Arrays.asList(4, 6, 12, 16));
    if (list.containsAll(isThereInside)){
      System.out.println("True");
    } else {
      System.out.println("false");
    }


  }

}
