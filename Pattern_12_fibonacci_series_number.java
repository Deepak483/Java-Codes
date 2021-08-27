import java.util.*;

public class Pattern_12_fibonacci_series_number {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number ");
    int n = s.nextInt();

    int a = 0;
    int b = 1;
    int c;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(a + " ");
        c = a + b;
        a = b;
        b = c;
      }
      System.out.println();
    }
  }
}