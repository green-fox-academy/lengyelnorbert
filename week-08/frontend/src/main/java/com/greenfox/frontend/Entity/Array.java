package com.greenfox.frontend.Entity;


import java.util.stream.IntStream;

public class Array implements GeneralReturnArray {

  private String what;
  private int[] numbers;
  private int result;
  private int[] resultNumbers;

  public Array() {
  }

  public Array(int result) {
    this.result = result;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public int getResult() {
    return result;
  }

  public int[] getResultNumbers() {
    return resultNumbers;
  }

  public void sumArrayElements() {
    result = IntStream.of(numbers).sum();
  }

  public void multiplyArrayElements() {
    result = 1;
    for (int i : numbers) {
      result *= i;
    }
  }

  public void doubleElement() {
    resultNumbers = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      resultNumbers[i] = numbers[i] * 2;
    }
  }
}
