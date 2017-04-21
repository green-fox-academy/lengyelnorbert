import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class todos {
  private int todoID;
  private static int todoRunningID =1;
  private String todoTaskText;
  private LocalDate createdAt;
  private LocalDate completedAt;
  private Time timeNeededToCompleteTheTask;


  private todos(String todoTaskText){
    this.todoTaskText = todoTaskText;
    todoID = todoRunningID;
    todoRunningID++;

  }
}




