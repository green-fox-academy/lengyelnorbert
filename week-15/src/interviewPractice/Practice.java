package interviewPractice;


import java.util.ArrayList;
import java.util.List;

public class Practice {

  public int upToThousand() {
    int sumSoFar = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sumSoFar += i;
      }
    }
    return sumSoFar;
  }

  public long fibonacci() {
    long toAdd = 2;
    List<Long> fibo = new ArrayList<>();
    fibo.add(1l);
    while (toAdd < 4000000) {
      fibo.add(toAdd);
      long firstToAdd = fibo.get(fibo.size() - 1);
      long secondToAdd = fibo.get(fibo.size() - 2);
      toAdd = firstToAdd + secondToAdd;
    }
    Long sum = 0l;
    for (Long longNumber : fibo) {
      if (longNumber % 2 == 0) {
        sum += longNumber;
      }
    }
    return sum;
  }

  public List<Long> largestPrimeFactor() {
    long n = 600851475143L;
    List<Long> primeFactors = new ArrayList<>();
    for (long i = 2; i <= n; i++) {
      if (n % i == 0) {
        primeFactors.add(i);
        n = n / i;
        i = 2;
      }
    }
    return primeFactors;
  }
}
