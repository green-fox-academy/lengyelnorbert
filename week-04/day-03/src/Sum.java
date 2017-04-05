import java.util.ArrayList;
import java.util.List;

public class Sum {


  public Sum() {
  }

  public int returnSum(List<Integer> toAdd){
    int sum = 0;
    for (int i=0; i<toAdd.size(); i++){
      sum += toAdd.get(i);
    }
    return sum;

  }

}