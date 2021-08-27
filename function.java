import java.util.Scanner;

/**
 * function
 */
public class function {
  public static int fact(int n) {
    int rv = 1;
    for (int i = 1; i <= n; i++) {
      rv *= i;
    }
    return rv;
  }

  public static void display(int n, int r, int nPr) {
    System.out.print(n + "P" + r + "=" + nPr);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();
    System.out.print("Enter the value of r:");
    int r = s.nextInt();

    int nfact = fact(n);
    int nmrfact = fact(n - r);
    int nPr = nfact / nmrfact;
    display(n, r, nPr);
  }
}