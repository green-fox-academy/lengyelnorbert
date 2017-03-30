// The fibonacci sequence is a famous bit of mathematics, and it happens to
// have a recursive definition. The first two values in the sequence are
// 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
// and so on. Define a recursive fibonacci(n) method that returns the nth
// fibonacci number, with n=0 representing the start of the sequence.

public class recFibonacci {

  public static void main(String[] args) {

    int fibNum = 10;

    System.out.println(fibNumCalc(fibNum, 0));

  }

  public static int fibNumCalc(int tillNum, int n){
    if (n == tillNum){
      return 0;
    }
    else{
      return n + fibNumCalc(tillNum, n+1 );

    }


  }



}
