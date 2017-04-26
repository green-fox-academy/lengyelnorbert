import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgumentHandler {

  public static void argumentHandlerTask (String[] args) {

    OptionParser parser = new OptionParser();

    parser.accepts("l");
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();
    parser.accepts("u").withOptionalArg();

    OptionSet options = parser.parse(args);

    if (!options.hasOptions()){
      System.out.println("No option given");
      FileHandler.showInfoMessage();
    }

    if (options.has("l")) {
      Operation.listTasks();
    }

    if (options.hasArgument("a")) {
      Operation.addTask(options.valueOf("a").toString());
    }

    if (options.hasArgument("r")) {
      Operation.removeTask(options.valueOf("r").toString());
    }

    if (options.hasArgument("c")) {
      Operation.checkTask(options.valueOf("c").toString());
    }
    if (options.hasArgument("u")) {
      Operation.updateTask(options.valueOf("u").toString());
    }
  }

}
