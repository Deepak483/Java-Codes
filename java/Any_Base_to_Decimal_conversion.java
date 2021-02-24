import java.util.Scanner;

/**
 * Any_Base_to_Decimal_conversion
 */
public class Any_Base_to_Decimal_conversion {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();
    System.out.print("Enter the value of base:");
    int b = s.nextInt();
    int ans = getValueInDecimal(n, b);
    System.out.print("number in decimal form is :" + ans);

  }

  public static int getValueInDecimal(int n, int b) {
    int rv = 0;
    int p = 1;
    while (n > 0) {
      int dig = n % 10;
      n = n / 10;

      rv = rv + dig * p;
      p = p * b;
    }
    return rv;
  }
}