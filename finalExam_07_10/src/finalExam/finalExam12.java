package finalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class finalExam12 {

  public static void main(String[] args) {
    List<Integer> data1 = Arrays.asList(10, 20, 30);
    List<Integer> data2 = Arrays.asList(40, 50, 60);
    List<Integer> data3 = Arrays.asList(70, 80, 90);
    List<Integer> data4 = Arrays.asList(1, 2, 3);
    List<Integer> data5 = Arrays.asList(4, 5, 6);
    List<Integer> data6 = Arrays.asList(7, 8, 9);
    List<List<Integer>> matrix = new ArrayList<>();
    matrix.add(data1);
    matrix.add(data2);
    matrix.add(data3);
    matrix.add(data4);
    matrix.add(data5);
    matrix.add(data6);

    int[] solution = examMethod(matrix);
    System.out.println(Arrays.toString(solution));
  }


  public static int[] examMethod(List<List<Integer>> matrix) {
    int[] finalArray = new int[matrix.size()];
    int sumOfARow;
    int finalArrayIndex = 0;
    for (List listInside : matrix) {
      sumOfARow = 0;
      for (int i = 0; i < listInside.size(); i++) {
        System.out.println(listInside.get(i));

        Object x = listInside.get(i);
        sumOfARow += (int) x;
      }
      finalArray[finalArrayIndex] = sumOfARow;
      finalArrayIndex++;
    }
    return finalArray;
  }
}
