import java.util.Arrays;

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
public class SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};
    String tempss = "";
    tempss = abc[0];
    abc[0] = abc[2];
    abc[2] = tempss;

    System.out.println(Arrays.toString(abc));

  }

}
