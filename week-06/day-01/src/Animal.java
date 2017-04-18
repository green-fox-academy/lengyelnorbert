
public abstract class Animal {

  String name;
  int age;
  String gender;
  boolean isAlive;
  boolean isDangerous;


  public abstract void greet();
  public abstract String wantChild();
  public abstract void canVisitorsFeedIt();
  public abstract void giveSomeNoise();


  public String getName() {
    return name;
  }
}
