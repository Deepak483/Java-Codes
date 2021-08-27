/**
 * StaticDemo
 */
public class StaticDemo {

  public static void main(String[] args) {

    Emp deepak = new Emp();
    deepak.eid = 93;
    deepak.salary = 4000;
    // Emp.ceo = "Mahesh";

    Emp shresth = new Emp();
    shresth.eid = 45;
    shresth.salary = 3000;
    // Emp.ceo = "navin reddy";

    deepak.show();
    shresth.show();
  }
}

class Emp {
  int eid;
  int salary;
  static String ceo;

  static { // when you load a class
    ceo = "larry";
    System.out.println("in static ");
  }

  public Emp() { // when you create an object
    eid = 1;
    salary = 5000;
    System.out.println("in constructor");
  }

  public void show() {
    System.out.println(eid + ":" + salary + ":" + ceo);
  }
}