package Oops_concept_in_Java;

/**
 * OverRidingDemo
 */

public class OverRidingDemo {

  public static void main(String[] args) {
    B obj = new B();
    obj.show();
  }
}

class A {
  public void show() {
    System.out.println("in A");
  }
}

class B extends A {

  public void show() {
    super.show();
    System.out.println("in B");
  }
}