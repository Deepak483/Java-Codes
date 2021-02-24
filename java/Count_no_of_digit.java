import java.util.Scanner;

public class Count_no_of_digit {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the digit to be count:");
    int n = scn.nextInt();
    int dig = 0;
    while (n != 0) {
      n = n / 10;
      dig++;
    }
    System.out.println(dig);

  }
}