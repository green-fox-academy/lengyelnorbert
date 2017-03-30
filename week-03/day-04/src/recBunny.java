// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
public class recBunny {

  public static void main(String[] args) {

    System.out.println(bunnyEarsCount(15, 2));

  }public static int bunnyEarsCount(int bunnyNumber, int earsCount){
    if (bunnyNumber == 0){
      return 0;
    }
    return bunnyEarsCount(bunnyNumber-1, earsCount) + earsCount;

  }


}
