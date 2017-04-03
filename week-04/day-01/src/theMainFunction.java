import java.util.Objects;

public class theMainFunction {

  public static void main(String[] args) {

    PostIt example_one = new PostIt();
    example_one.backGroundColor = "orange";
    example_one.textColor = "blue";
    example_one.textOnIt = "Idea 1";

    PostIt example_two = new PostIt();
    example_two.backGroundColor = "pink";
    example_two.textColor = "black";
    example_two.textOnIt = "Awesome";

    PostIt example_three = new PostIt("yellow", "green", "Superb");
    PostIt example_four = new PostIt("blue", "gree", "text");

    BlogPost bpFirst = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
    BlogPost bpSecond = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost bpThird = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.","2017.03.28.");

  }
}
