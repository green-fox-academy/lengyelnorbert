import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

  static String dataFilePath = "src/main/resources/data.csv";
  static String usageInfoFilePath = "src/main/resources/usageinfo.csv";

  public static boolean isFileExist(String checkThisFileForExistense) {
    try {
      File f = new File(checkThisFileForExistense);
      if (!f.exists()) {
        System.out.println("This csv file does not exist");
        return false;
      } else {
        System.out.println("This csv file exists already");
      }
    } catch (Exception e) {
      System.out.println("Error during testing if file exists or not...");
      e.printStackTrace();
    }
    return true;
  }

  public static List<String[]> fileReader(String readThisFile) {
    List<String[]> linesToRead = new ArrayList<>();
    if (isFileExist(readThisFile)) {
      try {
        CSVReader reader = new CSVReader(new FileReader(readThisFile), ';');
        linesToRead = reader.readAll();
      } catch (IOException e) {
        System.out.println("Error during reading the file. Error message: " + e.getMessage());
      } catch (Exception e) {
        System.out.println("Error, error message: " + e.getMessage());
      }
    }
    return linesToRead;
  }

  public static void fileWriter(List<String[]> linesToWrite) {
    if (isFileExist(dataFilePath)) {
      try {
        CSVWriter writer = new CSVWriter(new FileWriter(dataFilePath), ';',
                CSVWriter.NO_QUOTE_CHARACTER);
        writer.writeAll(linesToWrite);
        writer.close();
      } catch (IOException e) {
        System.out.println("Error during writing the file. Error message: " + e.getMessage());
      } catch (Exception e) {
        System.out.println("Error, error message: " + e.getMessage());
      }
    }
  }

  public static void linePrinter(List<String[]> linesToPrint) {
    for (String[] stringLine : linesToPrint) {
      System.out.println();
      for (int i = 0; i < stringLine.length; i++) {
        System.out.print(stringLine[i] + ", ");
      }
    }
  }
}
