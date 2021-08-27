import java.util.*;

/**
 * Finding_elements_in_Array
 */
public class Finding_elements_in_Array {

  public static void main(String[] args) {

    // write your code here
    
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the how many number you want to enter");
    int n = s.nextInt();
    int[] arr;
    arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt();
    }
    
    System.out.print("Enter the number you want to find: ");
    int data = s.nextInt();

    int idx = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == data) {
        idx = i;
        break;
      }
    }
    if (idx == -1) {
      System.out.print("this number is not in array");
    } else {
      System.out.print("The number you have entered is at index " + idx);

    }
  }
}