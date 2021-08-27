import java.util.*;

public class Swapping_of_the_number {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first number:");// enter the first number
    int first = s.nextInt();
    System.out.print("Enter the second number:");// enter the second number
    int second = s.nextInt();
    System.out.println("--Before Swapping--");
    System.out.println("first number is " + first);
    System.out.println("second number is " + second);

    // initialization of the temporary number
    int temp = first;
    first = second;
    second = temp;

    System.out.println("--After Swapping--");
    System.out.println("first number is " + first);
    System.out.println("second number is " + second);
  }
}