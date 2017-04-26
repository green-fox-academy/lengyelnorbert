import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class App {

  public static void main(String[] args) {
    ArgumentHandler weatherChecker = new ArgumentHandler();

    weatherChecker.isOptionOrArgumentGiven(args);

    OptionParser parser = new OptionParser();
    parser.accepts("c").withRequiredArg();
    parser.accepts("compare").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("c") && options.has("compare")) {
      System.out.println(
              "-c and -compare was given with the argument " + options.valueOf("c")
                      + " and argument " + options
                      .valueOf("compare"));
      String valueOfFirstCountryCode = options.valueOf("c").toString();
      String valueOfSecondCountryCode = options.valueOf("compare").toString();
      weatherChecker.compareWeather(valueOfFirstCountryCode, valueOfSecondCountryCode);
    } else if (options.has("c")) {
      System.out.println("`-c` was given with the argument " + options.valueOf("c"));
      String valueOfOptionC = options.valueOf("c").toString();
      weatherChecker.checkWeather(valueOfOptionC);
    }
  }
}
