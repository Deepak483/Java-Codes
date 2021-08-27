import java.util.*;

public class GCD_LCM {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first number:");
    int n1 = s.nextInt();
    System.out.print("Enter the second number:");
    int n2 = s.nextInt();
    // GCD
    int on1 = n1;
    int on2 = n2;
    while (n1 % n2 != 0) {
      int rem = n1 % n2;
      n1 = n2;
      n2 = rem;

    }
    int gcd = n2;
    System.out.println("GCD is " + gcd);
    // LCM
    int lcm = (on1 * on2) / gcd;
    System.out.println("LCM is " + lcm);
  }
}