public class if_and_else {
  public static void main(String[] args) {
    // Write code here
    int n1 = 35;
    int n2 = 32;
    // if (n1 == n2) {
    // System.out.println(n1 + " and " + n2 + " are equal ");
    // } else {
    // if (n1 > n2) {
    // System.out.println(n1 + " is greater than " + n2);
    // } else {
    // System.out.println(n1 + " is smaller than " + n2);
    // }
    // }
    if (n1 == n2) {
      System.out.println(n1 + " and " + n2 + " are equal");
    } else if (n1 > n2) {
      System.out.println(n1 + " is greater than " + n2);
    } else {
      System.out.println(n1 + " is smaller than " + n2);
    }
  }
}