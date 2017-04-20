package com.greenfox.lengyelnorbert.birthdaycalculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;
import java.util.Locale;
import java.util.Scanner;

public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {


  @Override
  public LocalDate parseDate(String str) {
    LocalDate date = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    return date;
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM. dd.");
    String formattedString = date.format(formatter);
    // TODO - return the date formatted: month & day (MM. dd.)
    return formattedString;
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String todayFormatted = today.format(formatter);
    String dateFormatted = date.format(formatter);
    return (todayFormatted.equals(dateFormatted));
    // TODO - return with true if today is the same month+day as date
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    LocalDate today = LocalDate.now();
    int thisYear = today.getYear();
    int thisYearDayNumber = today.getDayOfYear();
    int birthYear = birthday.getYear();
    int birthYearDayNumber = birthday.getDayOfYear();
    int calculatedAge =
            (thisYearDayNumber >= birthYearDayNumber) ? thisYear - birthYear : thisYear -
                    birthYear;
    // TODO - return how many years age the input date 'birthday' was
    return calculatedAge;
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    LocalDate today = LocalDate.now();
    int dateYear = today.getYear();
    int daysRemainingTillTheNextAnniversary;
    int daysInYear = Year.of(dateYear).length();

    if (today.getDayOfYear() > date.getDayOfYear()) {
      daysRemainingTillTheNextAnniversary = daysInYear - today.getDayOfYear() + date.getDayOfYear();
    }else if(today.getDayOfYear() < date.getDayOfYear()){
      daysRemainingTillTheNextAnniversary = date.getDayOfYear() - today.getDayOfYear();
    }else {daysRemainingTillTheNextAnniversary = 0;}
    // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
    return daysRemainingTillTheNextAnniversary;
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}
