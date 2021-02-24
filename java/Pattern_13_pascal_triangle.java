import java.util.*;

public class Pattern_13_pascal_triangle {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    for (int i = 0; i < n; i++) {

      int icj = 1;

      for (int j = 0; j <= i; j++) {

        System.out.print(icj + "\t");
        int icjp1 = icj * (i - j) / (j + 1);
        icj = icjp1;
      }
      System.out.println();
    }
  }
}