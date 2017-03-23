// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)


public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    String s1, s3, finaltext="";
    String s2 = "always takes longer than";
    s1 = quote.substring(0, 21);
    s3 = quote.substring(21);

    finaltext = s1 + s2 + " " + s3;
    System.out.print(finaltext);






  }
}
