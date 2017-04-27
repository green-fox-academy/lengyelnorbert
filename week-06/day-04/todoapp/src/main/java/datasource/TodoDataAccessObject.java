package datasource;

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
    for (Todo todo: listToSave)
    {entiesLines.add(todo.toDataFormat());
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
      todoEntities.add(ToDoFactory.createTodo(todoData));
    }
    return todoEntities;
  }
}
