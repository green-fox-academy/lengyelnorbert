// Write a recursive function that takes one parameter: n and counts down from n.

public class Recursion1 {

  public static void main(String[] args) {
    int numberSent = 10;
    firstRecursion(numberSent);

  }

  public static void firstRecursion(int first) {
    if (first == 0) {
      System.out.println("the end");
    } else {
      System.out.println(--first);
      firstRecursion(first);
    }
  }
}

