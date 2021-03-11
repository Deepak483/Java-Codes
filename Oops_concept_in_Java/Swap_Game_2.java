package Oops_concept_in_Java;

import java.util.*;

/**
 * Swap_Game_2
 */
public class Swap_Game_2 {

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.age = 10;
    p1.name = "A";
    // p1.sayHii();

    Person p2 = new Person();
    p2.age = 13;
    p2.name = "B";
    // p2.sayHii();

    p1.sayHii();
    p2.sayHii();
    swap(p1, p2);
    p1.sayHii();
    p2.sayHii();

  }

  public static void swap(Person psn1, Person psn2) {
    int age = psn1.age;
    psn1.age = psn2.age;
    psn2.age = age;

    String name = psn1.name;
    psn1.name = psn2.name;
    psn2.name = name;
  }

  // public static void swap(Person psn1, Person psn2) {
  // Person temp = psn1;
  // psn1 = psn2;
  // psn2 = temp;

  // }
}

class Person {
  int age;
  String name;

  public void sayHii() {

    System.out.println(name + "[" + age + "] say Hii");
  }
}