import java.util.*;

public class demo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    // conditional loop
    int sp = n - 1;
    int st = 1;
    for (int i = 1; i <= n; i++) {
      // System.out.print(sp + "," + st);
      for (int j = 1; j <= sp; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <= st; j++) {
        System.out.print("*\t");
      }
      sp--;
      st++;
      System.out.println();
    }
  }
}