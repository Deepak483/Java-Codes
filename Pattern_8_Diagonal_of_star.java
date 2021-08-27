import java.util.*;

public class Pattern_8_Diagonal_of_star {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    int sp = 0;
    int st = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= sp; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <= st; j++) {
        System.out.print("*\t");
      }
      sp++;
      System.out.println();
    }
  }
}