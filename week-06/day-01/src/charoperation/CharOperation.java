package charoperation;

public class CharOperation implements CharSequence {

  String textString;

  CharOperation(String textString) {
    this.textString = textString;
  }

  @Override
  public int length() {
    return textString.length();
  }

  @Override
  public char charAt(int index) {
    return textString.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    CharSequence returnCS = textString.substring(start, end);
    String returnString = "";
    for (int i = returnCS.length() - 1; i >= 0; i--) {
      returnString += charAt(i);
    }
    return returnString;
  }

  @Override
  public String toString() {
    String returnString = "";
    for (int i = textString.length() - 1; i >= 0; i--) {
      returnString += charAt(i);
    }
    return returnString;
  }
}


