import java.awt.datatransfer.StringSelection;
import java.lang.reflect.Executable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import sun.text.resources.cldr.ia.FormatData_ia;

public class Lotto {


  public static void main(String[] args) {
    ArrayList<Integer> numberKickOut = new ArrayList<>();
    ArrayList<Integer> theFinalList = new ArrayList<>();

    List<String> originalFile = fileReading();

    List<String> justTheNumbers = getJustTheNumbers(originalFile);

    int[] numberAmount = numbersInTheList(justTheNumbers);
    System.out.println(Arrays.toString(numberAmount));

    for (int i = 0; i < 5; i++) {

      ArrayList<Integer> currentHighestNumber = highestIndexes(numberAmount, numberKickOut);
      System.out.println("current highest number: " + currentHighestNumber);
      numberKickOut.add(currentHighestNumber.get(0));
      theFinalList.addAll(currentHighestNumber);

    }
    System.out.println(theFinalList);
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

  public static ArrayList<Integer> highestIndexes(int[] toCheck, ArrayList<Integer> kikout) {
    for (int t = 0; t < toCheck.length; t++) {
      for (int p = 0; p < kikout.size(); p++) {
        if (toCheck[t] == kikout.get(p)) {
          toCheck[t] = 0;
        }
      }

    }

    int largestNumber = 0;
    int largestIndex = 0;
    ArrayList<Integer> finalSolution = new ArrayList<>();
    for (int i = 0; i < toCheck.length; i++) {
      if (toCheck[i] > largestNumber) {
        finalSolution.clear();
        largestNumber = toCheck[i];
        largestIndex = i;
        finalSolution.add(0, largestNumber);
        finalSolution.add(largestIndex + 1);
      } else if (toCheck[i] == largestNumber) {
        largestNumber = toCheck[i];
        largestIndex = i;
        finalSolution.add(largestIndex + 1);
      }
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

//
//  public static int findLargest(int array[]){
//    int largest = array[0];
//    int largestIndex = 0;
//
//    for(int i = 0; i < array.length; i++)
//    {
//      if(array[i] > largest) {
//        largest = array[i];
//        largestIndex =i;
//      }
//    }
//
//    return largestIndex;

