import java.util.Scanner;

/**
 * Digit_frequency
 */
public class Digit_frequency {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();
    System.out.print("Enter the value of d:");
    int d = s.nextInt();
    int f = getDigitFrequency(n, d);
    System.out.print("Frequency of the Digit is  :" + f);
  }

  public static int getDigitFrequency(int n, int d) {
    int count = 0;
    while (n > 0) {
      int dig = n % 10;
      n = n / 10;

      if (dig == d) {
        count++;
      }
    }
    return count;
  }
}