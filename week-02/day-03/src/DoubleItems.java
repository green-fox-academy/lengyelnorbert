import java.util.Arrays;

// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
public class DoubleItems {

  public static void main(String[] args) {
    int[] ag = {3, 4, 5, 6, 7};

    int tempfig = 0;

    for (int i = 0; i < ag.length; i++) {
      ag[i] = ag[i] * 2;


    }

    System.out.print(Arrays.toString(ag));
  }
}

