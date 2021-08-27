import java.util.*;

public class Pattern_5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    int st = n;
    int sp = 0;
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= sp; j++) {
        System.out.print("\t");
      }

      for (int j = 1; j <= st; j++) {
        System.out.print("*\t");
      }

      sp++;
      st--;
      System.out.println();
    }
  }
}