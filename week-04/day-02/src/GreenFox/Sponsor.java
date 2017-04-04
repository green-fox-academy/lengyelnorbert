package GreenFox;


public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", " + age + " year old" + gender + " who represents " + company
                    + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    super();
    company = "Google";
    hiredStudents = 0;
  }


}
