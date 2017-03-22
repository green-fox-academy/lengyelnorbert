// - Write a function called `sum` that sum all the numbers
//   until the given parameter
public class Sum {

  public static void main(String[] args) {

    int givenParameter = 1000;
    System.out.println(sum(givenParameter));

  }

  public static int sum(int akarmi) {
    int sumnumber = 0;
    for (int i = 0; i <= akarmi; i++) {
      sumnumber = sumnumber + i;
    }
    return sumnumber;


  }
}
