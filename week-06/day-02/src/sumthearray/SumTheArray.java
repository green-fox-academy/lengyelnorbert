package sumthearray;

public class SumTheArray {

  public static void main(String[] args) {
    Integer[] intArray = {33, 55, 1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};

    try {
      System.out.println("Array integer sum:");
      System.out.println(sumArray(intArray, 4));

      System.out.println("\nArray double sum:");
      System.out.println(sumArray(doubleArray, 66));
    }catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static <T extends Number> double sumArray(T[] inputArray, int tillThisElementToAdd)
          throws Exception {
    double sum = 0;
    try {
      for (int i = 0; i < tillThisElementToAdd; i++) {
        T temp = inputArray[i];
        sum += temp.doubleValue();
      }
    } catch (IndexOutOfBoundsException e) {
      throw new Exception("Given index is out of bound / error message to throw");
    } catch (Exception e) {
      System.out.println("other error... I cannot do it...");
    }
    return sum;
  }
}
