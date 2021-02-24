import java.util.*;

public class Pythagoras_triplets {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first side:");
    int a = s.nextInt();
    System.out.print("Enter the second side:");
    int b = s.nextInt();
    System.out.print("Enter the hypotenuse side:");
    int c = s.nextInt();

    // Declaring max
    int max = a;
    if (b >= max) {
      max = b;
    }
    if (c >= max) {
      max = c;
    }
    if (max == a) {
      boolean flag = ((b * b + c * c) == (a * a));
      System.out.println(flag);
    } else if (max == b) {
      boolean flag = ((a * a + c * c) == (b * b));
      System.out.println(flag);
    } else {
      boolean flag = ((a * a + b * b) == (c * c));
      System.out.println(flag);
    }
  }
}