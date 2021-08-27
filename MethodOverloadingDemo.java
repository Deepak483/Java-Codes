
/**
 * MethodOverloadingDemo
 */
public class MethodOverloadingDemo {

  public static void main(String[] args) {

    Casio obj = new Casio(4, 5, "Nothing");
    obj.perform(4, 5);
    obj.perform(4, 5, 3);
    obj.perform(4.5, 8.0, 3.4);
    obj.show();
  }
}

class Casio {
  int num1;
  int num2;
  String operation;

  public void perform(int i, int j) {
    System.out.println(i + j);
  }

  public void perform(int i, int j, int k) {
    System.out.println(i + j + k);
  }

  public void perform(double i, double j, double k) {
    System.out.println(i + j + k);
  }

  public Casio(int i, int j, String op) {
    num1 = i;
    num2 = j;
    operation = op;

  }

  public void show() {
    System.out.println(num1 + ":" + num2 + ":" + operation);
  }

}