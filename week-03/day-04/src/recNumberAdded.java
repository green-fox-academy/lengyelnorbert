// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class recNumberAdded {

  public static void main(String[] args) {

    int n = 5;
    int finalSum = recNumAdd(n);
    System.out.println(finalSum);


  }

  public static int recNumAdd(int number) {
    if (number == 0) {
      return 0;
    }
    return recNumAdd(number - 1) + number;


  }


}






