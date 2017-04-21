import java.util.List;

public class Operation {



  public static void checkIfFileExist() {
    if (!FileHandler.isTodoFileExist()) {
      FileHandler.createTodoFile();
    }
  }

  public static void addNewTodo(String todoFileName, String newTodoText) {
    List<String[]> todoFileData = FileHandler.readAndReturnDataFromFile(todoFileName);
    Todo.setTodoTotalRunningID(Integer.parseInt(todoFileData.get(todoFileData.size()-1)[6]));
    Todo newTodo = new Todo(newTodoText);
    todoFileData.add(newTodo.todoToArray());
    FileHandler.writeDataToFile(Main.getTodoFilePlace(), todoFileData);
  }
}
