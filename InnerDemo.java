/**
 * InnerDemo
 * Inner Class 
 * Member class
 * Anonymous class
 */
public class InnerDemo {

  public static void main(String[] args) {
    Outer obj = new Outer();
    obj.show();
    Outer.Inner obj1 = new Outer.Inner();
    obj1.display();
  }
}

class Outer {
  public Object obj1;
  static int a;

  public void show() {

  }

  static class Inner { // Outer$inner.class

    public void display() {
      System.out.println("in display");
    }
  }
}