
public class SharpieMain {

  public static void main(String[] args) {

    Sharpie mySharpie = new Sharpie("red", 2.8f);
    System.out.println(mySharpie.shColor + " " + mySharpie.shWidth + " " + mySharpie.shInkAmount);
    mySharpie.shUse();
    mySharpie.shUse();
    System.out.println(mySharpie.shColor + " " + mySharpie.shWidth + " " + mySharpie.shInkAmount);

    Sharpie sh1 = new Sharpie("green", 2.0f);
    Sharpie sh2 = new Sharpie("blue", 3.9f);
    Sharpie sh3 = new Sharpie("yellow", 1f);
    Sharpie sh4 = new Sharpie("black", 9f);


  }

}
