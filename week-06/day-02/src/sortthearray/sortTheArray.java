package sortthearray;

import java.util.Arrays;

public class sortTheArray {

  public static void main(String[] args) {

    // Create arrays of Integer, Double and Character
    Integer[] intArray = {22, 33, 55, 1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.println("Array integerArray contains:");
    descendingSort(intArray);   // pass an Integer array

    System.out.println("\nArray doubleArray contains:");
    descendingSort(doubleArray);   // pass a Double array

    System.out.println("\nArray characterArray contains:");
    descendingSort(charArray);   // pass a Character array
  }


  public static <T> void descendingSort(T[] arrayToSort) {
//    for (T element: arrayToSort){
    Arrays.sort(arrayToSort);
    System.out.println(Arrays.toString(arrayToSort));
  }
}
