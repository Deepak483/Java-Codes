import java.util.Scanner;

public class Prime_Number_part3 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the lower number:");
    int low = scn.nextInt();
    System.out.println("Enter the high number:");
    int high = scn.nextInt();
    System.out.println("This are the prime number between " + low + " and " + high);

    for (int n = low; n <= high; n++) {
      int count = 0;
      for (int div = 2; div * div <= n; div++) {
        if (n % div == 0) {
          count++;
          break;
        }
      }
      if (count == 0) {
        System.out.println(n);
      }
    }

  }
}