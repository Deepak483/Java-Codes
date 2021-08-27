/**
 * Two_Dimensional_Array
 */
public class Two_Dimensional_Array {

  public static void main(String[] args) {

    int a[] = { 4, 5, 3, 2, 9 };
    int b[] = { 2, 4, 5, 8 };
    int c[] = { 5, 8, 4, 2 };
    int d[][] = { { 4, 37, 38, 2, 34, 23 }, { 2, 4, 5, 6, 3, 6, 32, 83 }, { 5, 6, 7, 8, 9, 7, 5 }

    };
    System.out.println(d[2][3]);
    // printing all the elements in array using for loop
    for (int i = 0; i < d.length; i++) {
      for (int j = 0; j < d[i].length; j++) { // jaggered array where elements in array not have fixed values
        System.out.print(" " + d[i][j]);
      }
      System.out.println();
    }
  }
}