import java.util.*;

// Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
// Do this again with a different solution using different list functions!

public class ElementFinder {

  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 7));

    if (arrayList.contains(7)) {
      System.out.println("Hoorray");
    } else {
      System.out.printf("Noooooo");
    }

    int isThere = 0;
    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i) == 7) {
        isThere = isThere + 1;
      }
    }
    if (isThere > 0) {
      System.out.println("Hoorray");
    } else {
      System.out.printf("Noooooo");
    }


  }

}
