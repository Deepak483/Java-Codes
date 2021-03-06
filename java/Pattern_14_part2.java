import java.util.Scanner;

/**
 * Pattern_14_part2
 */
public class Pattern_14_part2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    int val = 1;
    int sp = n / 2;
    int st = 1;
    for (int i = 1; i <= n; i++) {
      int cval = val;
      for (int j = 1; j <= sp; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <= st; j++) {
        System.out.print(cval + "\t");
        if (j <= st / 2) {
          cval++;
        } else {
          cval--;
        }
      }
      if (i <= n / 2) {
        sp--;
        st += 2;
        val++;
      } else {
        sp++;
        st -= 2;
        val--;
      }
      System.out.println();
    }
  }
}