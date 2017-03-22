// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorio {

  public static void main(String[] args) {

    int givenParameter = 3;
    System.out.println(fact(givenParameter));

  }

  public static int fact(int akarmi) {
    int sumnumber = 1;
    for (int i = 1; i <= akarmi; i++) {
      sumnumber = sumnumber * i;
    }
    return sumnumber;


  }

}
