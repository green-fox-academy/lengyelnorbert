
public class Student extends Person {

  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name +", " + age + " year old" + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public Student(String name, int age, String gender, String previousOrganization){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "to The School of Life";
    skippedDays = 0;
  }




}
