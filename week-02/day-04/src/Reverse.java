
// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.


public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    String textForward = "";
    char tempCharToAdd ;

    for (int i=reversed.length()-1; i >= 0; i--){
    tempCharToAdd = reversed.charAt(i);

      textForward = textForward + tempCharToAdd;



    }


    System.out.println(reversed);
    System.out.println(textForward);
  }
}