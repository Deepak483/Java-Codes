import java.util.*;

public class Pattern_7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    int st = n / 2 + 1;
    int sp = 1;
    // for loop

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= st; j++) {
        System.out.print("*\t");
      }
      for (int j = 1; j <= sp; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <= st; j++) {
        System.out.print("*\t");
      }
      if (i <= n / 2) {
        st--;
        sp += 2;
      } else {
        st++;
        sp -= 2;
      }
      System.out.println();
    }
  }
}