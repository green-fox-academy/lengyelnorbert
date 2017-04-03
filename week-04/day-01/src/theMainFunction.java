import java.util.Objects;

public class theMainFunction {

  public static void main(String[] args) {

    PostIt example_one = new PostIt();
    example_one.backGroundColor = "orange";
    example_one.textColor = "blue";
    example_one.textOnIt = "Idea 1";

    PostIt example_two = new PostIt()
    example_two.backGroundColor = "pink";
    example_two.textColor = "black";
    example_two.textOnIt = "Awesome";

    PostIt example_three = new PostIt("yellow", "green", "Superb");

    PostIt example_four = new PostIt("blue", "gree", "text");



    
  }
}
