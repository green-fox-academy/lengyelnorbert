package charoperation;

public class Main {

  public static void main(String[] args) {

    CharOperation testString = new CharOperation("test this string");

    System.out.println(testString.subSequence(3, 10));
    System.out.println(testString.length());
    System.out.println(testString.charAt(3));
    System.out.println(testString.toString());

  }
}
