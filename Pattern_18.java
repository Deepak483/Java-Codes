import java.util.Scanner;

/**
 * Pattern_18
 */
public class Pattern_18 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1) {
          if (j == n || j <= n / 2 + 1) {
            System.out.print("*\t");
          } else {
            System.out.print("\t");
          }
        } else if (i <= n / 2) {
          if (j == n || j == n / 2 + 1) {
            System.out.print("*\t");
          } else {
            System.out.print("\t");
          }

        } else if (i == n / 2 + 1) {
          System.out.print("*\t");

        } else if (i > n / 2 + 1) {
          if (j == 1 || j == n / 2 + 1) {
            System.out.print("*\t");
          } else {
            System.out.print("\t");
          }

        } else if (i == n) {
          if (j == 1 || j >= n / 2 + 1) {
            System.out.print("*\t");
          } else {
            System.out.print("\t");
          }
        } else {
          System.out.print("\t");
        }

      }

      System.out.println();
    }
  }
}