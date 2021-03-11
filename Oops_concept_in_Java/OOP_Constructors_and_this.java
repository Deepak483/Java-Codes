package Oops_concept_in_Java;

import java.util.*;

/**
 * OOP_Constructors_and_this
 */
public class OOP_Constructors_and_this {

  public static void main(String[] args) {

    Person p1 = new Person(18, "Deepak Tiwari");
    p1.sayHii();
    Person p2 = new Person();
    p2.age = 20;
    p2.name = "Shresth";
    p2.sayHii();
  }
}

class Person {
  int age;
  String name;

  public void sayHii() {
    System.out.println(name + " [" + age + "] say hii");
  }

  // if you forget , java provides our class as default constructor
  Person() {
    // default constructor
  }

  // parametrized constructor
  Person(int age, String name) {
    this.age = age;
    this.name = name;
  }
}
