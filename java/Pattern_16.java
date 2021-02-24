import java.util.Scanner;

/**
 * Pattern_16
 */
public class Pattern_16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();
    int sp = n / 2;
    int st = 1;
    for (int i = 1; i <= n; i++) {
      // System.out.println(sp + "," + st);
      for (int j = 1; j <= sp; j++) {
        if (i == n / 2 + 1) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");
        }
      }
      for (int j = 1; j <= st; j++) {
        System.out.print("*\t");
      }

      if (i <= n / 2) {
        st++;
      } else {
        st--;
      }
      System.out.println();
    }
  }
}