package entity;

import com.sun.deploy.util.StringUtils;
import java.time.ZonedDateTime;

public class ToDoFactory {

  public static Todo createTodo(String[] todoStringArray) {

    int todoID = Integer.parseInt(todoStringArray[0]);
    ZonedDateTime createdAt = ZonedDateTime.parse(todoStringArray[1]);
    ZonedDateTime completedAt = (todoStringArray[2] == null || todoStringArray[2].isEmpty()) ? null
            : ZonedDateTime.parse(todoStringArray[2]);
    String taskText = todoStringArray[3];
    return new Todo(todoID, createdAt, completedAt, taskText);
  }
}
