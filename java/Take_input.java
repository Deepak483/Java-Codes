import java.util.Scanner;

public class Take_input {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a integer value");
    int n = Integer.parseInt(scn.nextLine());
    for (int i = 1; i <=n; i++) {
      System.out.println(i);
    }
    System.out.print("Enter your name:");
    String x = scn.nextLine();
    System.out.println("Hello," + x + " we are done");

  }
}