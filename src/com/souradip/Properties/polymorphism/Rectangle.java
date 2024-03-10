package com.souradip.Properties.polymorphism;

public class Rectangle extends Shape {

  @Override
  public void area () {
    System.out.println("Area of rectangle is l * b");
  }

  //public static void area () {
  //  System.out.println("Area of rectangle is l * b");
  //}
}
