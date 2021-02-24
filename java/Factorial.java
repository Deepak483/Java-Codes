import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long fact = 1;
    System.out.println("Enter the number :");
    int n = scn.nextInt();
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of the number is :" + fact);

  }
}