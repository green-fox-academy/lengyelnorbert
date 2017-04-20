import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class lotteryFilter {

  static String sourceFile = "src/main/java/otos.csv";
  static String destinationFile = "src/main/java/output.csv";
  static String lottoYear;


  public static void main(String[] args) {

    OptionParser parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("y")) {
      lottoYear = options.valueOf("y").toString();
      System.out.println(lottoYear);

      if (options.has("f") || options.has("o")) {
        if (options.has("f")) {
          sourceFile = options.valueOf("f").toString();
        }
        if (options.has("o")) {
          destinationFile = options.valueOf("o").toString();
        }
      }
      fileHandler();
    }
  }

  public static void fileHandler() {
    List<String[]> temp = new ArrayList<>();
    try {
      CSVReader reader = new CSVReader(new FileReader(sourceFile), ';');
      List<String[]> lines = reader.readAll();
      for (String[] str : lines) {
        if (str[0].equals(lottoYear)) {
          temp.add(str);
        }
      }
      CSVWriter writer = new CSVWriter(new FileWriter(destinationFile), ';',
              CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(temp);
      writer.close();
    } catch (Exception e) {
      System.out.println("error");
    }
  }
}
