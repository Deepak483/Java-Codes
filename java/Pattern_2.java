import java.util.*;

public class Pattern_2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n = s.nextInt();

    // for loop
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}