
// java program to extract digits
// Importing libraries
import java.util.*;
import java.io.*;

public class Digit_ofthenumber {
  // Main driver function
  public static void main(String[] args) {
    // using the scanner function
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    // Printing the last digit of the number
    while (n != 0) {
      int remainder = n % 10;
      System.out.println(remainder);// Printing the remainder

      // Removing the last digit current
      n = n / 10;
    }
  }
}