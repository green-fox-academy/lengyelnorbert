import com.sun.xml.internal.fastinfoset.util.StringArray;
import java.io.File;
import java.lang.reflect.Array;
import java.util.List;

public class ArgumentHandler {


  public void isOptionOrArgumentGiven(String[] args) {
    if (args.length == 0) {
      FileHandler.linePrinter(FileHandler.fileReader(FileHandler.usageInfoFilePath));
    }
  }

  public void checkWeather(String valueOfOptionC) {
    String countryCode = valueOfOptionC.toUpperCase();
    String[] getCountryElement = getTheCountry(countryCode);
    System.out.println(getCountryElement[3]); // just for checking
  }

  public void compareWeather (String countryA, String CountryB){
    String countryCodeA = countryA.toUpperCase();
    String countryCodeB = CountryB.toUpperCase();
    String[] getCountryElementA = getTheCountry(countryCodeA);
    String[] getCountryElementB = getTheCountry(countryCodeB);
    System.out.println(getCountryElementA[3] + " - " + getCountryElementB[3]); // just for checking

  }

  public String[] getTheCountry(String countryCode){
    List<String[]> dataList = FileHandler.fileReader(FileHandler.dataFilePath);
    String[] calledCountry = new String[dataList.get(0).length];
    for (String[] listElement : dataList){
      if (countryCode.equals(listElement[0])){
        calledCountry = listElement;
      }
    }
    return calledCountry;
  }
}
