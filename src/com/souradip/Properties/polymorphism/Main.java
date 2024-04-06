package com.souradip.Properties.polymorphism;

// Runtime/Dynamic polymorphism is achieved by method overriding
// If subclass (child class) has the same method as declared in the parent class,
// it is known as method overriding in Java.
// Method overriding is done during runtime
// Polymorphism has nothing to do with instance variables
public class Main {

  public static void main(String[] args) {

    Shape obj1 = new Shape();
    obj1.area();

    Circle c = new Circle();
    c.area();

    Shape r = new Rectangle();
    //r.area();

    //Method overriding takes place here when reference variable i.e. obj2 is of type parent class i.e. Shape
    // and the object of subclass i.e. Circle is created
    //Reference variable i.e. obj2 is referring to object of subclass i.e. Circle
    //area() method is present in both parent class and subclass
    // so the method area() of parent class is getting overridden
    Shape obj2 = new Circle();
    obj2.area();
    //area() method will not get overridden if area is declared as static in main and subclasses
    // because static methods are independent of object
    //If independent of object then that method can directly be accessed
    // using class-name so no overriding can be done
  }
}
