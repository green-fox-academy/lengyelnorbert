import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class App {

  public static void main(String[] args) {
    ArgumentHandler weatherChecker = new ArgumentHandler();

    weatherChecker.isOptionOrArgumentGiven(args);

    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("c").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("c")) {
      System.out.println("`-c` was given with the argument " + options.valueOf("c"));
      String valueOfOptionC = options.valueOf("c").toString();
      weatherChecker.checkWeather(valueOfOptionC);
    }

    if (options.has("l")) {
      System.out.println("`-l` was given with the no additional information.");
    }
  }

}
