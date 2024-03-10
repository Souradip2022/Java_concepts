package com.souradip.Inner_class_types;

public class OuterClass {
  int count;

  class NormalInner {
    public void greet(){
      System.out.println("Hi Souradip!");
    }
  }

  /*public static void main(String[] args) {
    Test3 obj1 = new Test3();
    Inner i1 = obj1.new Inner();
  }*/
}

class Main1 {
  public static void main(String[] args) {
    OuterClass obj1 = new OuterClass();
    OuterClass.NormalInner i1 = obj1.new NormalInner();
    i1.greet();
  }
}
