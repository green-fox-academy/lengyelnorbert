import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Todo {

  private int todoID;
  private static int todoTotalRunningID = 1;
  private String todoTaskText;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private Time timeNeededToCompleteTheTask;
  private boolean taskIsDone = false;
  private final String UNDONE = "[ ]";
  private final String DONE = "[X]";

  Todo(String todoTaskText) {
    todoID = todoTotalRunningID;
    todoTotalRunningID++;
    taskIsDone = false;
    createdAt = getNowDateAndTime();
    completedAt = null;
    timeNeededToCompleteTheTask = null;
    this.todoTaskText = todoTaskText;
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
}




