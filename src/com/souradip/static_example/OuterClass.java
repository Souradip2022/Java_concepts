package com.souradip.static_example;

public class OuterClass {

  static class InnerClass {
    //static keyword used here states that InnerClass is not dependent on objects of OuterClass
    //InnerClass can have its own instances
    String name;

    public InnerClass (String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) {

    InnerClass a = new InnerClass("Souradip");
    InnerClass b = new InnerClass("Anubhav");

    System.out.println(b.name);
    System.out.println(a.name);
  }
}
