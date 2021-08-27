import java.util.*;

/**
 * Sum_of_the_array
 */
public class Sum_of_the_array {

  public static void main(String[] args) {
    // Write your code here
    Scanner s = new Scanner(System.in);
    // taking of the first number
    System.out.print("Enter the first number's digit:");
    int n1 = s.nextInt();
    int[] a1 = new int[n1];
    for (int i = 0; i < a1.length; i++) {
      a1[i] = s.nextInt();
    }

    // taking of the second number
    System.out.print("Enter the second number's digit:");
    int n2 = s.nextInt();
    int[] a2 = new int[n2];
    for (int i = 0; i < a2.length; i++) {
      a2[i] = s.nextInt();
    }

    int[] sum = new int[n1 > n2 ? n1 : n2];
    int c = 0;

    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = sum.length - 1;

    while (k >= 0) {
      int d = c;

      if (i >= 0) {
        d += a1[i];
      }
      if (j >= 0) {
        d += a2[j];
      }

      c = d / 10;
      d = d % 10;

      sum[k] = d;

      i--;
      j--;
      k--;

      if (c != 0) {
        System.out.println(c);
      }
      for (int val : sum) {
        System.out.println(val);
      }

    }

  }
}