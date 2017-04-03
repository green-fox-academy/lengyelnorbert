import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class TreesHomework {

  public static void main(String[] args) {

    List<Object> treesForHomework = new ArrayList<>();
    treesForHomework.add(new ArrayList<Objects>());
    treesForHomework.add(new ArrayList<Objects>());
    treesForHomework.add(new ArrayList<Objects>());
    treesForHomework.add(new ArrayList<Objects>());

    ((ArrayList)treesForHomework.get(0)).add("bukkfa");
    ((ArrayList)treesForHomework.get(0)).add("sarga");
    ((ArrayList)treesForHomework.get(0)).add(4);
    ((ArrayList)treesForHomework.get(0)).add("fiu");

    ((ArrayList)treesForHomework.get(1)).add("tolgy");
    ((ArrayList)treesForHomework.get(1)).add("zold");
    ((ArrayList)treesForHomework.get(1)).add(45);
    ((ArrayList)treesForHomework.get(1)).add("lany");

    ((ArrayList)treesForHomework.get(2)).add("fenyo");
    ((ArrayList)treesForHomework.get(2)).add("piros");
    ((ArrayList)treesForHomework.get(2)).add(12);
    ((ArrayList)treesForHomework.get(2)).add("fiu");

    ((ArrayList)treesForHomework.get(3)).add("makk");
    ((ArrayList)treesForHomework.get(3)).add("barna");
    ((ArrayList)treesForHomework.get(3)).add(9);
    ((ArrayList)treesForHomework.get(3)).add("lany");

    System.out.println(treesForHomework);




  }

}
