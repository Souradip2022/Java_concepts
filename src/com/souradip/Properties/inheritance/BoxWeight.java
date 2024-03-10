package com.souradip.Properties.inheritance;

public class BoxWeight extends Box {

  int weight;

  BoxWeight () {
    super();
    this.weight = -1;
  }
  BoxWeight (int weight) {
    super();
    //super.l = 3;
    this.weight = weight;
  }

  BoxWeight (int l, int weight) {
    super(l); //Call the parent class constructor
    //Used to initialize values present in the parent class just 1 level above the present child class
    this.weight = weight;
  }

  BoxWeight (int l, int w, int h, int weight) {
    super(l, w, h);
    //super.l = l; //Alternative way to initialize parent class variables
    //super.w = w;
    //super.h = h;
    this.weight = weight;

    //Both super and this keyword results in the same output in this case
    //Because value of h is same in both parent and children class
    //super keyword is used to access variables and methods of parent class
    //this keyword is used to access variables and methods of the present class
    //System.out.println(super.h);
    //System.out.println(this.h);
  }

  BoxWeight (BoxWeight bw) {
    super(bw);
    this.weight = bw.weight;
  }
}
