package GreenFox;

import GreenFox.Person;

public class Mentor extends Person {

  String level;

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", " + age + " year old" + gender + " " + level + " mentor.");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    level = "intermediate";
  }


}
