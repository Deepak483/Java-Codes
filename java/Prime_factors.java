import java.util.*;

public class Prime_factors {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // Taking input as n
    System.out.print("Enter the number: ");
    int n = s.nextInt();

    // Condition
    for (int div = 2; div * div <= n; div++) {
      while (n % div == 0) {
        n = n / div;
        System.out.print("Factors are " + div + " ");
      }
    }
    if (n != 1) {
      System.out.print(n);
    }
  }
}