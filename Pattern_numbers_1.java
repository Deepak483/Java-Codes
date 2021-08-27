import java.util.*;

public class Pattern_numbers_1 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number you want to print in number format: ");
    int n = s.nextInt();

    int value = 1; // Initialization
    // conditional loop

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(value + " ");
        value++;
      }
      System.out.println();
    }

  }
}