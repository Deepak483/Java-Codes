import java.util.*;

public class Pattern_4_numbes {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    // condition for loop for printing 123...n
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}