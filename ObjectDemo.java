/**
 * ObjectDemo
 */

public class ObjectDemo {

  public static void main(String[] args) {
    // write your code here
    Calc obj = new Calc(); // Constructor
    obj.num1 = 5;
    obj.num2 = 4;
    obj.perform(3, 4);
    System.out.println(obj.result);
    System.out.println(obj.num1);
  }
}

class Calc {
  int num1, num2;
  int result;

  public void perform(int num1, int num2) {

    this.num1 = num1;
    this.num2 = num2;
    result = num1 + num2;

  }
}