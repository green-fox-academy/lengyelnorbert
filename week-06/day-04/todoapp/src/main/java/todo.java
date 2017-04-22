import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Todo {

  private int todoID;
  private static int todoTotalRunningID = 1;
  int todosSoFar;

  private String todoTaskText;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private Time timeNeededToCompleteTheTask;
  private boolean taskIsDone = false;
  private final String UNDONE = "[ ]";
  private final String DONE = "[X]";

  Todo() {
    todoID = todoTotalRunningID;
    todoTotalRunningID++;
    taskIsDone = false;
    createdAt = getNowDateAndTime();
    completedAt = null;
    timeNeededToCompleteTheTask = null;
  }

  public static int getTodoTotalRunningID() {
    return todoTotalRunningID;
  }

  public static void setTodoTotalRunningID(int todoTotalRunningID) {
    Todo.todoTotalRunningID = todoTotalRunningID;
  }

  private LocalDateTime getNowDateAndTime() {
    LocalDateTime rightNow = LocalDateTime.now();
    return rightNow;
  }

  public String[] todoToArray() {
    String[] todoToArray = new String[7];
    todoToArray[0] = String.valueOf(todoID);
    todoToArray[1] = String.valueOf(taskIsDone);
    todoToArray[2] = String.valueOf(createdAt);
    todoToArray[3] = String.valueOf(completedAt);
    todoToArray[4] = String.valueOf(timeNeededToCompleteTheTask);
    todoToArray[5] = String.valueOf(todoTaskText);
    todoToArray[6] = String.valueOf(todoTotalRunningID);
    return todoToArray;
  }

  public static Todo arrayToTodo(String[] todoStringLines){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
    Todo todoItem = new Todo();
    todoItem.todoID = Integer.parseInt(todoStringLines[0]);
    todoItem.taskIsDone = Boolean.parseBoolean(todoStringLines[1]);
    todoItem.createdAt = LocalDateTime.parse(todoStringLines[2], formatter);
    todoItem.completedAt = null; //LocalDateTime.parse(todoStringLines[3], formatter);
    todoItem.timeNeededToCompleteTheTask = null;
    todoItem.todoTaskText = todoStringLines[5];
    todoItem.todosSoFar = todoTotalRunningID;
    return todoItem;
}

  public void setTodoTaskText(String todoTaskText) {
    this.todoTaskText = todoTaskText;
  }
}





