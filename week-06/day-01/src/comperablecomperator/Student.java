package comperablecomperator;

public class Student extends Person implements Comparable {

  String previousOrganization;
  int skippedDays;

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", " + age + " year old" + gender + " from " + previousOrganization
                    + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super();
    previousOrganization = "to The School of Life";
    skippedDays = 0;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}


