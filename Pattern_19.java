import java.util.Scanner;

/**
 * Pattern_19
 */
public class Pattern_19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of N:");
    int n = s.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j == 1 || j == n) {
          System.out.print("*\t");
        } else if (i >= n / 2 + 1 && (i == j || i + j == n + 1)) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");
        }
      }
      System.out.println();
  }
}