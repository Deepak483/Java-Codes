
import java.util.*;

/**
 * Span_of_Array
 */
public class Span_of_Array {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = s.nextInt();
    int[] arr;
    arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt();
    }

    int max = arr[0];
    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
   
    int span = max - min;
    System.out.print("Span of the number is " + span);

  }
}