/**
 * Exception_Handling_Try_Catch_Finally
 */
public class Exception_Handling_Try_Catch_Finally {

  public static void main(String[] args) {
    try {
      int i = 7;
      int j = 0;
      int k = i / j;
      System.out.println("output is " + k);
      // System.out.println("runned");
    } catch (ArithmeticException e) {
      System.err.println("Error");
      // System.out.println("runned");
    } finally {
      System.out.println("runned");
    }
  }
}