import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

  private static List<Todo> todosList;
  private static String todoFilePlace = "src/main/java/todo.csv";
  private static String infoFilePlace = "src/main/java/basicinfo.csv";


  public static void main(String[] args) {

    FileHandler.checkIfFileExist();

    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("a").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("l")) {
      FileHandler.showInfoMessage(infoFilePlace);
    } else if (options.has("a")) {
      addNewTodo(options.valueOf("a").toString());
    }


  }


  public static String getTodoFilePlace() {
    return todoFilePlace;
  }

  public static void addNewTodo (String newTodoText){

    Todo todo = new Todo(newTodoText);

  }

}

//    if (options.has("l")) {
//            System.out.println("`-l` was given with the no additional information.");
//            if (options.has("a")) {
//            System.out.println("`-a` was given with the argument " + options.valueOf("a"));
//            }
