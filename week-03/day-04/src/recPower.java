// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class recPower {

  public static void main(String[] args) {

    System.out.println(recPower(2, 4));
  }

  public static int recPower(int first, int second){
    if (second == 0){
      return 1;
    }
    return recPower(first, second-1) * first;




  }


}
