import java.util.ArrayList;
import java.util.List;

public class Operation {

  static List<String[]> todoFileData;
  static List<Todo> todoList;


  public static void checkIfFileExist() {
    if (!FileHandler.isTodoFileExist()) {
      FileHandler.createTodoFile();
    }
  }

  public static void addNewTodo(String newTodoText) {
    todoList = new ArrayList<>();
    readDataAndFillUpTodoStringAndObjectList();
    Todo newTodo = new Todo();
    newTodo.setTodoTaskText(newTodoText);
    todoList.add(newTodo);
    writeDataFile();
  }

  public static void readDataAndFillUpTodoStringAndObjectList() {
    todoFileData = FileHandler.readAndReturnDataFromFile(Main.getTodoFilePlace());
    int newRunningTotalID = Integer.parseInt(todoFileData.get(todoFileData.size()-1)[6]);
    Todo.setTodoTotalRunningID(newRunningTotalID);
    for (String[] todoStringLines : todoFileData) {
      todoList.add(Todo.arrayToTodo(todoStringLines));
    }
  }

  public static void writeDataFile(){
    for (Todo todoItem: todoList){
      todoFileData.add(todoItem.todoToArray());
    }
    FileHandler.writeDataToFile(Main.getTodoFilePlace(), todoFileData);
  }
}
