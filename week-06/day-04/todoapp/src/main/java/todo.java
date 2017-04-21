import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class todo {
  private static List<todos> todosList;
  private static String todosFilePlace = "src/main/java/todos.csv";
  private static String infoFilePlace =


  public static void main(String[] args) {

    checkIfFileExist();

    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("a").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("a")) {
      System.out.println("`-a` was given with the argument " + options.valueOf("a"));

    }

    if (options.has("l")) {
      System.out.println("`-l` was given with the no additional information.");
    }
  }


  public static String getTodosFilePlace() {
    return todosFilePlace;
  }

  public static void checkIfFileExist(){
    if (!fileHandler.isTodoFileExist()){
      fileHandler.createTodoFile();
    }
  }
}
