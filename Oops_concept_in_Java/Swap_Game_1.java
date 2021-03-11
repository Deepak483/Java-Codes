package Oops_concept_in_Java;

import java.util.*;

/**
 * Swap_Game_1
 */
public class Swap_Game_1 {

  class Person {
    int age;
    String name;

    public void sayHii() {
      System.out.println(name + "[" + age + "] say Hii");
    }
  }

  public static void main(String[] args) {

    Person p1 = new Person();
    p1.age = 18;
    p1.name = "A";
    p1.sayHii();

    Person p2 = new Person();
    p2.age = 20;
    p2.name = "B";
    p2.sayHii();


    swap(p1,p2);

    public static void swap(Person psn1, Person psn2){
      Person temp = psn1,
      psn1 = psn2,
      psn2 = temp;
    }
  }
}
