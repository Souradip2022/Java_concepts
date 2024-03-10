package com.souradip.Properties.inheritance;

//Both BoxColor and BoxPrice class extends the same parent class
//This property where more there are more than one subclasses
// for a single superclass is called hierarchical inheritance
public class BoxColor extends BoxWeight {

  String color;

  BoxColor() {
    super();
    this.color = null;
  }

  BoxColor(int weight, String color) {
    super(weight);
    this.color = color;
  }

  BoxColor(int l, int w, int h, int weight, String color) {
    super(l, w, h, weight);
    this.color = color;
  }
}
