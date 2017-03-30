import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by kispista on 2017.03.28..
 */
public class Doubled {

  public static void main(String[] args) {

    List<String> doubleText = fileReading();
    List<String> finalSolution = decrypt(doubleText);
    System.out.println(finalSolution);


  }

  public static List<String> fileReading() {
    Path doubledFilePath = Paths.get("assets/duplicated-chars.txt");
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(doubledFilePath);
    } catch (Exception ex) {
      System.out.println("Something went wrong");
    }
    return lines;
  }

  public static List<String> decrypt(List<String> textToFix) {
    List<String> finalText = new ArrayList<>();
    List<String> tempList = new ArrayList<>();
    for (String line : textToFix) {
      for (int i = 0; i < line.length(); i += 2) {
        tempList.add()
      }
    }
    return tempList;
  }

}
