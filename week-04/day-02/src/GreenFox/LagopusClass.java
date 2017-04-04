package GreenFox;


import java.util.ArrayList;
import java.util.List;

public class LagopusClass {

  String className;
  List<Student> students = new ArrayList<>();
  List<Mentor> mentors = new ArrayList<>();


  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(
            "Lagopus " + className + " has got " + students.size() + " students, and " + mentors
                    .size() + " mentors");
  }

  public LagopusClass(String className) {
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

  }

}
