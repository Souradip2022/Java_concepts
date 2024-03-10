package com.souradip.Properties.inheritance;

public class Main {

  public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box(4);
    Box box3 = new Box(3, 5, 7);
    Box box4 = new Box(box3);
    //System.out.println(box1.l + " " + box1.w + " " + box1.h);
    //System.out.println(box3.l + " " + box3.w + " " + box3.h);
    //System.out.println(box4.l + " " + box4.w + " " + box4.h);

    BoxWeight obj1 = new BoxWeight();
    BoxWeight obj2 = new BoxWeight(15);


    BoxWeight obj3 = new BoxWeight(3, 5, 7, 15);
    //System.out.println(obj1.l + " " + obj1.w + " " + obj1.h + " " + obj1.weight);
    //System.out.println(obj2.l + " " + obj2.w + " " + obj2.h + " " + obj2.weight);

    //b1 is of reference type Box so it should contain l ,w ,h values
    //When we call child class constructor i.e. BoxWeight the parent class i.e. Box is also initialised
    //Therefore b1 contain values of l, w, h
    Box b1 = new BoxWeight(3, 5, 7, 18);
    //System.out.println(b1.l + " " + b1.w + " " + b1.h);


    //We are given access to variables of reference type i.e. BoxWeight
    //Hence, we should have access to weight variable
    //This also means once we are tyring to access parent class i.e. Box child class i.e. BoxWeight should also be initialised
    //But Box being parent class itself cannot call constructor of BoxWeight
    //So we get an error
    //BoxWeight b2 = new Box();

    BoxPrice bp1 = new BoxPrice();
    BoxPrice bp2 = new BoxPrice(5, 90);
    BoxPrice bp3 = new BoxPrice(4, 5, 7, 15, 90);
    //System.out.println(bp1.l + " " + bp1.w + " " + bp1.h + " " + bp1.weight + " " + bp1.price);
    System.out.println(bp3.l + " " + bp3.w + " " + bp3.h + " " + bp3.weight + " " + bp3.price);

    BoxColor bcl1 = new BoxColor(4, 7, 8, 15, "red");
    System.out.println(bcl1.l + " " + bcl1.w + " " + bcl1.h + " " + bcl1.weight + " " + bcl1.color);
  }
}
