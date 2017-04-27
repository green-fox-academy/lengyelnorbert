import entity.Todo;
import java.util.List;

public class Operation {

  static final int CSV_COLUMN_COUNT = 4;
  List<Todo> todoList;
  List<String[]> todoListString;


  public static void listTasks() {
  }

  public static void addTask(String a) {
  }

  public static void removeTask(String r) {
  }

  public static void checkTask(String c) {
  }

  public static void updateTask(String u) {
  }

  private void todoListToArrayList (List<Todo> todoList){
    for (Todo todoItem : todoList) {
      todoListString.add(todoElementToArray(todoItem));
    }
  }

  private String[] todoElementToArray(Todo todo) {
    String[] todoToArray = new String[CSV_COLUMN_COUNT];
    todoToArray[0] = String.valueOf(todo.getTodoID());
    todoToArray[1] = String.valueOf(todo.getCreatedAt());
    todoToArray[2] = String.valueOf(todo.getCompletedAt());
    todoToArray[3] = String.valueOf(todo.getTaskText());
    return todoToArray;
  }
}
//  static List<String[]> todoFileData;
//  static List<Todo> todoList;
//
//  public static void checkIfFileExist() {
//    if (!FileHandler.isTodoFileExist()) {
//      FileHandler.createTodoFile();
//    }
//  }
//
//  public static void addNewTodo(String newTodoText) {
//    todoList = new ArrayList<>();
//    fileDataToObject();
//    Todo newTodo = new Todo();
//    newTodo.setTodoTaskText(newTodoText);
//    todoList.add(newTodo);
//    writeDataFile();
//  }
//
//  public static void fileDataToObject() {
//    todoFileData = FileHandler.readDataFromFile(FileHandler.getTodoFilePlace());
//    int newRunningTotalID = Integer.parseInt(todoFileData.get(todoFileData.size()-1)[6]);
//    Todo.setTodoTotalRunningID(newRunningTotalID);
//    for (String[] todoStringLines : todoFileData) {
//      todoList.add(Todo.arrayToTodo(todoStringLines));
//    }
//  }
//
//  public static void writeDataFile(){
//    for (Todo todoItem: todoList){
//      todoFileData.add(todoItem.todoToArray());
//    }
//    FileHandler.writeDataToFile(FileHandler.getTodoFilePlace(), todoFileData);
//  }
//}
//  private LocalDateTime getNowDateAndTime() {
//    return LocalDateTime.now();
//  }
