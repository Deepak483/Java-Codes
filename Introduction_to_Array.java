import java.io.*;
import java.util.*;

/**
 * Introduction_to_Array
 */
public class Introduction_to_Array {

  public static void main(String[] args) {

    int[] arr = new int[5];
    arr[0] = 24;
    arr[1] = 36;
    arr[2] = 48;
    arr[3] = 27;
    arr[4] = 3;

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}