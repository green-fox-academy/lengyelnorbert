// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class recBunnyTwo {

  public static void main(String[] args) {

    System.out.println(bunnyEarsCount (20, 1));

  }

  public static int bunnyEarsCount(int bnum, int oneEar){
    if (bnum == 0){
      return 0;
    }
    else if (bnum % 2 == 0){
      return bunnyEarsCount(bnum-1, oneEar) + 2* oneEar;
    }
    else {
      return bunnyEarsCount(bnum-1, oneEar) + 3* oneEar;
    }



  }

}
