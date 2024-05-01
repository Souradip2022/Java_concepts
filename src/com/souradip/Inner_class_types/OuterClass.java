package com.souradip.Inner_class_types;

public class OuterClass {
  int count;

  class NormalInner {
    public void greet() {
      System.out.println("Hi Souradip!");
    }
  }

  /*public static void main(String[] args) {
    OuterClass obj1 = new OuterClass();
    NormalInner i1 = obj1.new NormalInner();
    i1.greet();
  }*/
}


class Main1 {
  public static void main(String[] args) {

    OuterClass obj1 = new OuterClass();
    OuterClass.NormalInner i1 = obj1.new NormalInner();
    i1.greet();

  }
}

