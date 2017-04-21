import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class Todo {
  private int todoID;
  private static int todoRunningID =1;
  private String todoTaskText;
  private LocalDate createdAt;
  private LocalDate completedAt;
  private Time timeNeededToCompleteTheTask;
  private boolean taskIsDone = false;
  private final String UNDONE = "[ ]";
  private final String DONE = "[X]";

  Todo(String todoTaskText){
    this.todoTaskText = todoTaskText;
    todoID = todoRunningID;
    todoRunningID++;
    taskIsDone = false;
    createdAt = getNowDateAndTime();
  }

  private LocalDate getNowDateAndTime(){
    LocalDate rightNow = LocalDate.now();
    return rightNow;
  }
}




