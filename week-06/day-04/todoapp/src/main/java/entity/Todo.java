package entity;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Todo implements Entity {

  private final int todoID;
  private final ZonedDateTime createdAt;
  private final ZonedDateTime completedAt;
  private final String taskText;

  public Todo(int todoID, ZonedDateTime createdAt, ZonedDateTime completedAt,
          String taskText) {
    this.todoID = todoID;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
    this.taskText = taskText;
  }

  public int getTodoID() {
    return todoID;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public ZonedDateTime getCompletedAt() {
    return completedAt;
  }

  public String getTaskText() {
    return taskText;
  }

  @Override
  public String toDataFormat() {
    String completedAt = this.completedAt == null ? "" : this.completedAt.toInstant().toString();
    return String.format("%s;%s;%s;%s", todoID, createdAt.toInstant().toString(),
            completedAt, taskText);
  }

  @Override
  public String toString() {
    String completedAtString = (completedAt == null) ?
            "not completed yet"
            : DateTimeFormatter.ofPattern("yyyy.MM.dd-hh:mm").format(completedAt) + " ";

    String complationTime = "not completed yet  ";
    if (completedAt != null) {
      long daysDifference = zonedDateTimeDifference(createdAt, completedAt, ChronoUnit.DAYS);
      complationTime = "completed in " + daysDifference + " days" + "";
    }
    return "Todo#" + todoID +
            ",  created at:" + DateTimeFormatter.ofPattern("yyyy.MM.dd-hh:mm").format(createdAt) +
            ",  completed at: " + completedAtString + "  " + complationTime + " " +
            ", >> " + taskText + " <<";
  }

  static long zonedDateTimeDifference(ZonedDateTime d1, ZonedDateTime d2, ChronoUnit unit) {
    return unit.between(d1, d2);
  }
}
