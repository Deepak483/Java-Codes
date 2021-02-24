import java.util.*;

public class digit_of_the_number {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number of the digit:");
    int n = scn.nextInt();

    int nod = 0;
    int temp = n;
    while (temp != 0) {
      temp = temp / 10;
      nod++;
    }

    int div = (int) (Math.pow(10, nod - 1));
    while (div != 0) {
      int q = n / div;
      System.out.println(q);
    }
    n = n % div;
    div = div / 10;
  }
}
