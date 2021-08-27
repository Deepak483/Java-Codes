// Abstract class-->Define and declare
//Interface->declare -> 1.7
//1.8 can define method in interface 

/**
 * Static_Method_in_Interface
 */
public class Static_Method_in_Interface {

  public static void main(String[] args) {
    Demo.show();
  }
}

interface Demo {
  int num = 8;

  void abc();

  static void show() {
    System.out.println("hi");
  }
}

class DemoImp implements Demo {
  public void abc() {

  }
}
