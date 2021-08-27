import java.util.*;

public class Reverse_of_the_number {

  public static void main(String[] args) {
    // write your code here
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number to be reversed:");
    int n = s.nextInt();

    while (n > 0) {
      int dig = n % 10;

      n = n / 10;
      System.out.println(dig);
    }

  }
}