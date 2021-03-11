package Oops_concept_in_Java;

/**
 * Dynamic_Method_Dispatch{
 * 
 */

public class Dynamic_Method_Dispatch {

  // compile time and runtime
  public static void main(String[] args) {

    A obj = new B();// runtime polymorphism
    obj.show();
    // obj.config();// you can only called that method in B which has same method in
    // super class A
    obj = new C();
    obj.show();//Dynamic Method Dispatch 
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

  // public void config() {
  // System.out.println("in config");
  // }
}

class C extends A {
  public void show() {
    System.out.println("in C");
  }
}