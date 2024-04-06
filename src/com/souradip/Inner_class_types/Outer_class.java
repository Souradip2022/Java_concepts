package com.souradip.Inner_class_types;

abstract class AnonymousInner {
  int i;
  public abstract void myMethod();
  void myMethod2() {
    System.out.println("Non abstract method declared in abstract class");
  }
}
public class Outer_class {
  public static void main(String args[]) {
    //AnonymousInner o1 = new AnonymousInner(); //Object creation for abstract class not possible

    AnonymousInner inner = new AnonymousInner() {
      @Override
      public void myMethod() {
        System.out.println("This is an example of anonymous inner class");
      }
    };
    inner.myMethod();
    inner.myMethod2();
    System.out.println(inner.i);
  }
}
