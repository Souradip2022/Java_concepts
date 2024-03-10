package com.souradip.packages;

public class Human {

  int age;
  int salary;
  String name;
  boolean married;
  static long population;
  static int count = 0;

  public Human(int age, int salary, String name, boolean married) {

    this.age = age;
    this.salary = salary;
    this.name = name;
    this.married = married;
    Human.population = 700000000;
    Human.count += 1;
  }

  public Human() {
    this.age = 19;
    this.name = "Souradip";
    this.salary = 800000;
    this.married = false;
    Human.population = 700000000;
    Human.count += 1;
  }


}
