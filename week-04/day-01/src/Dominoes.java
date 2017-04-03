import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dominoes {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    //    System.out.println(Arrays.toString(dominoes.get(0).getValues()));
//    System.out.println(dominoes.get(0).getValues()[1]);
//    System.out.println(dominoes.get(4).getValues()[0]);
//    System.out.println(dominoes.get(4).getValues().length);
//
    System.out.println(dominoes);

    List<Domino> sortedDom = new ArrayList<>();

    sortedDom.add(dominoes.get(0));
    dominoes.remove(0);

    while (dominoes.size() != 0) {
      int listTill = dominoes.size();
      for (int i = 0; i < listTill; i++) {
        if (dominoes.get(i).getValues()[0] == (sortedDom.get(sortedDom.size() - 1)
                .getValues()[1])) {
          sortedDom.add(dominoes.get(i));
          dominoes.remove(i);
          listTill--;
        }
      }
    }

    System.out.println(sortedDom);


  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}