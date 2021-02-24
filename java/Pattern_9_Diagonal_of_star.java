import java.util.*;

public class Pattern_9_Diagonal_of_star {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();
    // for loop

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i + j == n + 1) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");
        }
      }
      System.out.println();
    }
  }
}