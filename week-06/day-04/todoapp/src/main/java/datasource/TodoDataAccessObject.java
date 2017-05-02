package datasource;

import controller.TodoController;
import entity.ToDoFactory;
import entity.Todo;
import java.util.ArrayList;
import java.util.List;

public class TodoDataAccessObject implements DataAccessObject<Todo> {

  private final FileHandler fileHandler;

  public TodoDataAccessObject(String filePath) {
    this.fileHandler = new FileHandler(filePath);
  }

  @Override
  public void saveAll(List<Todo> listToSave) {
    List<String> entiesLines = new ArrayList<>();
    entiesLines.add(String.format("HEAD;total todos sofar >>;%d;", TodoController.getTotalTodoID()));
    for (Todo todo : listToSave) {
      entiesLines.add(todo.toDataFormat());
    }
    fileHandler.writeDataToFile(entiesLines);
  }

  @Override
  public List<Todo> loadAll() {
    List<Todo> todoEntities = new ArrayList<>();
    fileHandler.createIfNotExist();
    List<String> todoStringList = fileHandler.readDataFromFile();
    for (String todoStringElement : todoStringList) {
      String[] todoData = todoStringElement.split(";");
      if (todoData[0].equals("HEAD")) {
        TodoController.setTotalTodoID(Integer.parseInt(todoData[2]));
      } else {
        todoEntities.add(ToDoFactory.createTodo(todoData));
      }
    }
    return todoEntities;
  }
}

