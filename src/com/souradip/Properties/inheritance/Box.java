package com.souradip.Properties.inheritance;

public class Box {

  int l, w, h;
  Box () {
    super(); //Object class
    //Box do not have any parent class so using super keyword is used to call object class constructor
    this.l = -1;
    this.w = -1;
    this.h = -1;
  }

  Box (int l) {
    this.l = l;
    this.w = l;
    this.h = l;
  }

  Box (int l, int w, int h) {
    this.l = l;
    this.w = w;
    this.h = h;
  }

  //Copy constructor
  Box (Box box) {
    this.l = box.l;
    this.w = box.w;
    this.h = box.h;
  }

}
