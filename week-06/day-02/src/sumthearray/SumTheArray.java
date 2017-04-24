package sumthearray;

public class SumTheArray {

  public static void main(String[] args) {
    Integer[] intArray = {33, 55, 1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};

    System.out.println("Array integer sum:");
    System.out.println(sumArray(intArray));

    System.out.println("\nArray double sum:");
    System.out.println(sumArray(doubleArray));
  }

  public static <T extends Number> double sumArray(T[] inputArray){
    double sum = 0;
    for (int i = 0; i < inputArray.length; i++) {
      T temp = inputArray[i];
      sum += temp.doubleValue();
    }return sum;
  }
}
