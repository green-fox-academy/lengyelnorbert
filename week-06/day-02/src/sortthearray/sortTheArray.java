package sortthearray;

import java.util.Arrays;

public class sortTheArray {

  public static void main(String[] args) {
    Integer[] intArray = {22, 33, 55, 1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.println("Array integerArray contains:");
    descendingSort(intArray);

    System.out.println("\nArray doubleArray contains:");
    descendingSort(doubleArray);

    System.out.println("\nArray characterArray contains:");
    descendingSort(charArray);
  }

  public static <T> void descendingSort(T[] arrayToSort) {
    try {
      Arrays.sort(arrayToSort);
      System.out.println(Arrays.toString(arrayToSort));
      System.out.println("sorted without problem");
    }catch (Exception e){
      System.out.println("problem...");
    }
  }
}
