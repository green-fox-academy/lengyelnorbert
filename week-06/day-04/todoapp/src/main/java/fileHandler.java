import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class fileHandler {

  public static boolean isTodoFileExist() {
    try {
      File f = new File(todo.getTodosFilePlace());
      if (!f.exists()) {
        System.out.println("This todo file did not exist");
        return false;
      } else {
        System.out.println("This todo file exists already");
      }
    } catch (Exception e) {
      System.out.println("Error during testing if file exists or not...");
      e.printStackTrace();
    }
    return true;
  }

  public static void createTodoFile() {
    try {
      File f = new File(todo.getTodosFilePlace());
      f.createNewFile();
      System.out.println("This todo file has just been created");
    } catch (Exception e) {
      System.out.println("Error during creating the file");
      e.printStackTrace();
    }
  }
}

//  CSVReader reader = new CSVReader(new FileReader("data.csv"), ';');
//  List<String[]> lines = reader.readAll();
//  CSVWriter writer = new CSVWriter(new FileWriter("copydata.csv"), ';',
//          CSVWriter.NO_QUOTE_CHARACTER);
//writer.writeAll(lines);
//        writer.close();
