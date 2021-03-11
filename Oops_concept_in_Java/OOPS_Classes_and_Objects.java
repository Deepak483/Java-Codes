import java.util.*;

/**
 * OOP's_Classes_and_Objects
 */
public class OOPS_Classes_and_Objects {

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.age = 10;
    p1.name = "A";
    p1.sayHi();

    Person p2 = new Person();
    p2.age = 20;
    p2.name = "B";
    p2.sayHi();

    Person p3 = p1;
    p3.age = 30;
    p3.name = "C";
    p3.sayHi();
    p1.sayHi();

  }
}

class Person {
  int age;
  String name;

  public void sayHi() {
    System.out.println(name + "[" + age + "] say Hii");
  }
}