package calculator;

public class Calculator {

  public static void main(String[] args) {

    System.out.println(add(4, 5, 6, 7, 8, 11, 99.9));
    System.out.println(deduct(99.99, 9));
    System.out.println(multiply(10.5, 5, 2, 3));
    System.out.println(divide(0, 5));
  }

  static <T extends Number> double add(T... numbers) {
    double sum = 0;
    try {
      for (int i = 0; i < numbers.length; i++) {
        T temp = numbers[i];
        sum += temp.doubleValue();
      }
    } catch (Exception e) {
      System.out.println("error: " + e.getMessage());
    }
    return sum;
  }

  static <T extends Number> double deduct(T first, T second) {
    double result = 0;
    try {
      result = first.doubleValue() - second.doubleValue();
    } catch (Exception e) {
      System.out.println("error: " + e.getMessage());
    }
    return result;
  }

  static <T extends Number> double multiply(T... numbers) {
    double result = 0;
    try {
      result = numbers[0].doubleValue();
      for (int i = 1; i < numbers.length; i++) {
        result *= numbers[i].doubleValue();
      }
    } catch (Exception e) {
      System.out.println("error: " + e.getMessage());
    }
    return result;
  }

  static <T extends Number> double divide(T first, T second) {
    double result = 0;
    if (first.doubleValue() != 0 && second.doubleValue() != 0) {
      try {
        result = first.doubleValue() / second.doubleValue();
      } catch (Exception e) {
        System.out.println("error");
      }
    }
    return result;
  }
}
