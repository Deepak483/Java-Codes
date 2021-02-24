import java.util.*;

public class Benjamin_button {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();

    for (int i = 1; i * i <= n; i++) {
      System.out.print(i * i + " ");
    }
  }
}