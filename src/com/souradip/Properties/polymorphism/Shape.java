package com.souradip.Properties.polymorphism;

public class Shape {

  public void area() {
    System.out.println("This is area of a particular shape");
  }

  //area() method cannot be overridden if declared as final and will result in error
  //final public void area () {
  //  System.out.println("This is area of a particular shape");
  //}

  //public static void area () {
  //  System.out.println("This is area of a particular shape");
  //}
}
