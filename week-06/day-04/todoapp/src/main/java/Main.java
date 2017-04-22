import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

  private static String todoFilePlace = "src/main/java/todo.csv";
  private static String infoFilePlace = "src/main/java/basicinfo.csv";

  public static void main(String[] args) {

    Operation.checkIfFileExist();

    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("a").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("l")) {
      FileHandler.showInfoMessage();
    } else if (options.has("a")) {
      Operation.addNewTodo(options.valueOf("a").toString());
    }
  }

  public static String getTodoFilePlace() {
    return todoFilePlace;
  }

  public static String getInfoFilePlace() {
    return infoFilePlace;
  }
}