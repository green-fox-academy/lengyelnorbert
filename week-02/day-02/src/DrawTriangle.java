import java.util.Scanner;

/**
 * Created by kispista on 2017.03.21..
 */
public class DrawTriangle {

  public static void main(String[] args) {

    Scanner thisInput = new Scanner(System.in);
    System.out.println(
            "Give me the number, that indicates how many lines of increasing stars you wish to print:");
    int theNumber = thisInput.nextInt();
    for (int i = 1; i <= theNumber; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
