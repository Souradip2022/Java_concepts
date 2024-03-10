package com.souradip.Properties.polymorphism;

// Static polymorphism/ Compile-time polymorphism is achieved via method overloading
//Method overloading means using same method for more than one purpose


public class StaticPolymorphism {

  int l, w, h;
  double r;

  StaticPolymorphism() {

  }

  //Cube
  StaticPolymorphism(int l) {
    this.l = l;
    this.w = l;
    this.h = l;
  }

  //Cuboid
  StaticPolymorphism(int l, int w, int h) {
    this.l = l;
    this.w = w;
    this.h = h;
  }

  //Circle
  StaticPolymorphism(double r) {
    this.r = r;
  }

  @Override
  public String toString () {
    return "Object-print {" + "Side = " + this.l + "}" ;
  }

  public static void main (String args[]) {

    StaticPolymorphism cube = new StaticPolymorphism(9);
    System.out.println(cube.l + " " + cube.r);

    //Every class by default has Object class as parent class
    //While printing object i.e. cube by default object class which is parent class of StaticPolymorphism class is
    // called which contains toString() method
    // but if the subclass i.e. StaticPolymorphism contain toString() method then the method of Object class is overridden by subclass
    System.out.println(cube);
  }
}
