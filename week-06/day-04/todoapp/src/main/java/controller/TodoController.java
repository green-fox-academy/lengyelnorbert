package controller;

import datasource.DataAccessObject;
import datasource.RunOptionDataAccessObject;
import datasource.TodoDataAccessObject;
import entity.RunOption;
import entity.ToDoFactory;
import entity.Todo;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoController {

  DataAccessObject<Todo> todoDao;
  DataAccessObject<RunOption> runOptionDao;

  private static int totalTodoID;

  public TodoController() {
    todoDao = new TodoDataAccessObject("src/main/java/datasource/todo.csv");
    runOptionDao = new RunOptionDataAccessObject("src/main/java/datasource/basicinfo.txt");
  }

  public void listAllTodo() {
    List<Todo> todoList = this.todoDao.loadAll();
    for (Todo todoElement : todoList) {
      System.out.println(todoElement.toString());
    }
  }

  public void addTodo(String taskText) {
    List<Todo> todoList = this.todoDao.loadAll();
    totalTodoID ++;
    String[] todoStringArr = new String[4];
    todoStringArr[0] = String.valueOf(totalTodoID);
    todoStringArr[1] = ZonedDateTime.now().toString();
    todoStringArr[2] = null;
    todoStringArr[3] = taskText;
    todoList.add(ToDoFactory.createTodo(todoStringArr));
    this.todoDao.saveAll(todoList);
  }

  public void removeTodo(String removeTodoID) {
    int todoIDToRemove = Integer.parseInt(removeTodoID);
    List<Todo> todoList = this.todoDao.loadAll();
    List<Todo> todoListAfterRemove = new ArrayList<>();
    for (Todo todoElement : todoList) {
      if (todoElement.getTodoID() != todoIDToRemove) {
        todoListAfterRemove.add(todoElement);
      }
    }
    this.todoDao.saveAll(todoListAfterRemove);
  }

  public void checkTodo(String checkTodo) {
    List<Todo> todoList = this.todoDao.loadAll();
    List<Todo> todoListAfterCheck = new ArrayList<>();
    try {
      int todoCheckID = Integer.parseInt(checkTodo);
      for (Todo todoElement : todoList) {
        if (todoElement.getTodoID() != todoCheckID) {
          todoListAfterCheck.add(todoElement);
        } else {
          String[] todoStringArr = new String[4];
          todoStringArr[0] = String.valueOf(todoElement.getTodoID());
          todoStringArr[1] = String.valueOf(todoElement.getCreatedAt());
          todoStringArr[2] = ZonedDateTime.now().toString();
          todoStringArr[3] = todoElement.getTaskText();
          todoListAfterCheck.add(ToDoFactory.createTodo(todoStringArr));
        }
      }
      this.todoDao.saveAll(todoListAfterCheck);
    } catch (Exception e) {
      System.out.println("not a valid ID");
    }
  }

  public void updateTodo(String updateTodo) {
    List<Todo> todoList = this.todoDao.loadAll();
    List<Todo> todoListAfterUpdate = new ArrayList<>();
    int indexToCutAt = updateTodo.indexOf(" ");
    int updateID = Integer.parseInt(updateTodo.substring(0, indexToCutAt));
    System.out.println(updateID);
    String updateString = updateTodo.substring(indexToCutAt);
    try {
      for (Todo todoElement : todoList) {
        if (todoElement.getTodoID() != updateID) {
          todoListAfterUpdate.add(todoElement);
        } else {
          String[] todoStringArr = new String[4];
          String completedAtString =
                  (todoElement.getCompletedAt() == null) ? null
                          : String.valueOf(todoElement.getCompletedAt());
          todoStringArr[0] = String.valueOf(todoElement.getTodoID());
          todoStringArr[1] = String.valueOf(todoElement.getCreatedAt());
          todoStringArr[2] = completedAtString;
          todoStringArr[3] = updateString;
          todoListAfterUpdate.add(ToDoFactory.createTodo(todoStringArr));
        }
      }
      this.todoDao.saveAll(todoListAfterUpdate);
    } catch (Exception e) {
      System.out.println("not a valid ID");
    }
  }

  public static int getTotalTodoID() {
    return totalTodoID;
  }

  public static void setTotalTodoID(int totalTodoID) {
    TodoController.totalTodoID = totalTodoID;
  }
}
