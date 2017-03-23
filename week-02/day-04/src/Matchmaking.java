import java.util.*;

// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...

public class Matchmaking {

  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(
            Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(
            Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    int longerList;
    if (boys.size() >= girls.size()) {
      longerList = boys.size();
    } else {
      longerList = girls.size();
    }
    longerList = 99;
    for (int i = 0; i < longerList; i++) {
      if (i < girls.size() && i < boys.size()) {
        order.add(girls.get(i) + ", " + boys.get(i));
      } else if (i < boys.size()) {
        order.add(boys.get(i));
      } else if (i < girls.size()) {
        order.add(girls.get(i));

      }

    }

    System.out.println(order);
  }
}