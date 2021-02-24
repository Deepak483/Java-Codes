import java.util.*;

public class Table_pattern {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int x = s.nextInt();

    // write your code here
    for (int i = 1; i <= 10; i++) {
      int v = x * i;
      System.out.print(x + " * " + i + " = " + v);
      System.out.println();
    }

  }
}