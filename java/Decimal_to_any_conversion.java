import java.util.Scanner;

/**
 * Decimal_to_any_conversion
 */
public class Decimal_to_any_conversion {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the digit:");
    int d = s.nextInt();
    System.out.print("Enter the base:");
    int b = s.nextInt();

    int f = getValueInBase(d, b);
    System.out.print("Value in base of " + b + " is " + f);
  }

  public static int getValueInBase(int n, int b) {
    int rv = 0;
    int p = 1;
    while (n > 0) {
      int dig = n % b;
      n = n / b;
      rv = rv + dig * p;
      p = p * 10;
    }

    return rv;
  }
}