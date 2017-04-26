import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Todo {

  private int todoID;
  private static int todoIDCounter;
  private ZonedDateTime createdAt;
  private ZonedDateTime completedAt;
  private int compilationTime;
  private String taskText;

  Todo() {

  }

  public int getTodoID() {
    return todoID;
  }

  public void setTodoID(int todoID) {
    this.todoID = todoID;
  }

  public static int getTodoIDCounter() {
    return todoIDCounter;
  }

  public static void setTodoIDCounter(int todoIDCounter) {
    Todo.todoIDCounter = todoIDCounter;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ZonedDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(ZonedDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public int getCompilationTime() {
    return compilationTime;
  }

  public void setCompilationTime(int compilationTime) {
    this.compilationTime = compilationTime;
  }

  public String getTaskText() {
    return taskText;
  }

  public void setTaskText(String taskText) {
    this.taskText = taskText;
  }
}
//
//
//

//  }
//
//  public static Todo arrayToTodo(String[] todoStringLines){
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
//    Todo todoItem = new Todo();
//    todoItem.todoID = Integer.parseInt(todoStringLines[0]);
//    todoItem.taskIsDone = Boolean.parseBoolean(todoStringLines[1]);
//    todoItem.createdAt = LocalDateTime.parse(todoStringLines[2], formatter);
//    todoItem.completedAt = null; //LocalDateTime.parse(todoStringLines[3], formatter);
//    todoItem.timeNeededToCompleteTheTask = null;
//    todoItem.todoTaskText = todoStringLines[5];
//    todoItem.todosSoFar = todoTotalRunningID;
//    return todoItem;
//}
//
//  public void setTodoTaskText(String todoTaskText) {
//    this.todoTaskText = todoTaskText;
//  }
//}
//
//  private static int todoTotalRunningID = 1;
//  int todosSoFar;
//
//  private String todoTaskText;
//  private LocalDateTime createdAt;
//  private LocalDateTime completedAt;
//  private Time timeNeededToCompleteTheTask;
//  private boolean taskIsDone = false;
//  private final String UNDONE = "[ ]";
//  private final String DONE = "[X]";




