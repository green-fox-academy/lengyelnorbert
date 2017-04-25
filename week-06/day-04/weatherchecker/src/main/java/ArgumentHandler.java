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
