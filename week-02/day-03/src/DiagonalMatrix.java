import java.util.Arrays;

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
public class DiagonalMatrix {

  public static void main(String[] args) {

    int size = 4;
    int[][] diagma;
    diagma = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == j) {
          diagma[i][j] = 1;
        } else {
          diagma[i][j] = 0;

        }
        System.out.print(diagma[i][j] + " ");
       }
      System.out.println();
    }


  }

}
