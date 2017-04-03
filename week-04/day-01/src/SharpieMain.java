
public class SharpieMain {

  public static void main(String[] args) {

    Sharpie mySharpie = new Sharpie("red", 2.8f);
    System.out.println(mySharpie.shColor + " " + mySharpie.shWidth + " " + mySharpie.shInkAmount);
    mySharpie.shUse();
    mySharpie.shUse();
    System.out.println(mySharpie.shColor + " " + mySharpie.shWidth + " " + mySharpie.shInkAmount);



  }

}
