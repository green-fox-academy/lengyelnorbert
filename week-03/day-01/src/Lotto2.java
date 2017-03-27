import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lotto2 {

  public static void main(String[] args) {

    List<String> originalFile = fileReading();

    List<String> justTheNumbers = getJustTheNumbers(originalFile);

    int[] numberAmount = numbersInTheList(justTheNumbers);
    System.out.println(Arrays.toString(numberAmount));

    ArrayList<Integer> currentHighestNumber = highestIndexes(numberAmount);
    System.out.println("highest numbers: " + currentHighestNumber);

  }


  public static List<String> fileReading() {
    Path lottoFilePath = Paths.get("assets/otos.csv");
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(lottoFilePath);
    } catch (Exception ex) {
      System.out.println("Something went wrong");
    }
    return lines;
  }

  public static List<String> getJustTheNumbers(List<String> thedatas) {
    List<String> dataSplitUp = new ArrayList<>();
    for (String line : thedatas) {
      List<String> tempSplitList = Arrays.asList(line.split(";"));
      for (int i = 11; i <= 15; i++) {
        dataSplitUp.add(tempSplitList.get(i));
      }
//      System.out.println(tempSplitList);
    }
    return dataSplitUp;
  }

  public static int[] numbersInTheList(List<String> originalString) {
    int[] numberslist = new int[90];
    for (int i = 0; i < originalString.size(); i++) {
      numberslist[Integer.parseInt(originalString.get(i)) - 1]++;
    }
    return numberslist;
  }

  public static ArrayList<Integer> highestIndexes(int[] toCheck) {
    int largestNumber = 0;
    int largestIndex = 0;
    ArrayList<Integer> finalSolution = new ArrayList<>();
//    finalSolution.clear();

    for (int i = 0; i < toCheck.length; i++) {
      if (toCheck[i] > largestNumber) {
        largestNumber = toCheck[i];
        largestIndex = i;
      }
      finalSolution.add(largestNumber);
      finalSolution.add(largestIndex + 1);
      toCheck[i] = 0;

    }

    return finalSolution;
  }

  public static int UserInput(String texthere) {
    System.out.println(texthere);
    Scanner scanner = new Scanner(System.in);
    int thatNumber = scanner.nextInt();
    return thatNumber;
  }
}
