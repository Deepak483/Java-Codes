import java.util.Scanner;

public class Natural_number_till_n {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = scn.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }
}