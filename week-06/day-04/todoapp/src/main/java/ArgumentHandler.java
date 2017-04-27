import controller.TodoController;
import datasource.FileHandler;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgumentHandler {

  public static void argumentHandlerTask (String[] args) {

    OptionParser parser = new OptionParser();
    TodoController todoController = new TodoController();
    parser.accepts("l");
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();
    parser.accepts("u").withOptionalArg();

    OptionSet options = parser.parse(args);

    if (args == null || args.length == 0){
      System.out.println("No option given");
    }

    if (options.has("l")) {
      todoController.listAllTodo();
    }

    if (options.hasArgument("a")) {
      todoController.addTodo(options.valueOf("a").toString());
    }

    if (options.hasArgument("r")) {
      todoController.removeTodo(options.valueOf("r").toString());
    }

    if (options.hasArgument("c")) {
      todoController.checkTodo(options.valueOf("c").toString());
    }
    if (options.hasArgument("u")) {
      todoController.updateTodo(options.valueOf("u").toString());
    }
  }

}
