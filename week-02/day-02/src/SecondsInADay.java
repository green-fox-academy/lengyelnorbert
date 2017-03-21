public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int totalSecondsInADay = 60 * 60 * 24;
    int goneSecondsAlready = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
    int remainingSeconds = totalSecondsInADay - goneSecondsAlready;

    System.out.println("Remaining seconds of this day: " + remainingSeconds);

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented bt the variables
  }
}