package Oops_concept_in_Java;

import java.util.*;

/**
 * Swap_Game_3
 */
public class Swap_Game_3 {

  public static void main(String[] args) {

    Person p1 = new Person();
    p1.age = 28;
    p1.name = "A";
    // p1.sayHii();

    Person p2 = new Person();
    p2.age = 30;
    p2.name = "B";
    // p2.sayHii();

    p1.sayHii();
    p2.sayHii();
    swap(p1, p2);
    p1.sayHii();
    p2.sayHii();

  }

  public static void swap(Person psn1, Person psn2) {
    psn1 = new Person();

    int age = psn1.age;
    psn1.age = psn2.age;
    psn2.age = age;

    psn2 = new Person();

    String name = psn1.name;
    psn1.name = psn2.name;
    psn2.name = name;
  }
}

class Person {
  int age;
  String name;

  public void sayHii() {
    System.out.println(name + "[" + age + "] say Hii");
  }
}

