import java.util.Scanner;

public class Fibonacci_series {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int c;
    System.out.println("Enter the value you want fibonacci till:");// Take the value of n
    int n = scn.nextInt();
    System.out.println(a);
    System.out.println(b);
    for (int i = 1; i <= n - 2; i++) {
      c = a + b;
      a = b;
      b = c;
      System.out.println(c);
    }
    System.out.println("hey! we are done this are fibonacci series of " + n + " numbers.");
  }
}
