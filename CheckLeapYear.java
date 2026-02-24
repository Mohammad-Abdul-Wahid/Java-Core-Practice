public class CheckLeapYear {
  public static void main(String[] args) {
    // Check whether a year is a leap year.
    // using nested if else
    int year = 1000;
    if (year % 4 == 0) {
    if (year % 100 == 0) {
    if (year % 400 == 0) {
    System.out.println("Leap year");
    } else {
    System.out.println("Not leap year");
    }
    } else {
    System.out.println("Leap year");
    }
    } else {
    System.out.println("not leap year");
    }

    // using ternary operator
    System.out
    .println(year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? "Leap year" :
    "Not leap year") : "leap year")
    : "Leap year");
  }
}
