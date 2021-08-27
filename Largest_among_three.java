import java.util.*;

public class Largest_among_three {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Taking the numbers

    System.out.print("Enter the first number: ");
    double n1 = s.nextDouble();
    System.out.print("Enter the second number: ");
    double n2 = s.nextDouble();
    System.out.print("Enter the three number: ");
    double n3 = s.nextDouble();

    // Checking the condition

    if (n1 >= n2) {
      if (n1 >= n3) {
        System.out.println(n1 + " is the greater");
      } else {
        System.out.println(n3 + " is the greater");
      }
    } else {
      if (n2 >= n3) {
        System.out.println(n2 + " is the greater");
      } else {
        System.out.println(n3 + " is the greater");
      }
    }
  }
}