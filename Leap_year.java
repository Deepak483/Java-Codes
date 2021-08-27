import java.util.*;

public class Leap_year {

  public static void main(String[] args) {
    // Scanner function
    Scanner s = new Scanner(System.in);
    // Taking the user input

    System.out.print("Enter the year:");
    int year = s.nextInt();

    // Condition checking for leap year
    // if year is divided by 4
    if (year % 4 == 0) {

      // if year is century
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          System.out.println(year + " is a leap year");
        } else {
          System.out.println(year + " is not a leap year");
        }
      } else {
        System.out.println(year + " is a leap year");
      }
    } else {
      System.out.println(year + " is not a leap year");
    }

  }
}