import java.util.*;

public class Pattern_11_Hollow_Star {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    int os = n / 2;
    int is = -1;

    // Condition for loop
    for (int i = 1; i <= n; i++) {
      // System.out.print(os + "," + is);
      for (int j = 1; j <= os; j++) {
        System.out.print("\t");
      }
      System.out.print("*\t");
      for (int j = 1; j <= is; j++) {
        System.out.print("\t");
      }
      if (i > 1 && i < n) {
        System.out.print("*\t");
      }
      if (i <= n / 2) {
        os--;
        is += 2;
      } else {
        os++;
        is -= 2;
      }
      System.out.println();

    }
  }
}
