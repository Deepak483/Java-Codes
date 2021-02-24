import java.util.Scanner;

public class Sum_of_the_number {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int sum = 0;
    System.out.print("Enter the number :");
    int n = scn.nextInt();
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("Sum of the first " + n + " natural number " + sum);
  }
}