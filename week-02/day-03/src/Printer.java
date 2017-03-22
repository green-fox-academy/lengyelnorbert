// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)
public class Printer {

  public static void main(String[] args) {
    String a1 = "I am";
    String a2 = "the";
    String a3 = "King";
    String a4 = "of";

    printer(a1, a2, a3, a4);
  }

  public static void printer(String... akarmi) {
    for (String ezt : akarmi)
    System.out.print(ezt + " ");

  }

}
