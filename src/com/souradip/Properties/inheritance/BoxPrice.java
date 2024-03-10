package com.souradip.Properties.inheritance;

//Both BoxColor and BoxPrice class extends the same parent class
//This property where more there are more than one subclasses
// for a single superclass is called hierarchical inheritance
public class BoxPrice extends BoxWeight {

  int price;

  public BoxPrice() {
    super();
    this.price = -1;
  }

  public BoxPrice(int weight, int price) {
    super(weight);
    this.price = price;
  }

  public BoxPrice(int l, int weight, int price) {
    super(l, weight);
    this.price = price;
  }

  BoxPrice(int l, int w, int h, int weight, int price) {
    super(l, w, h, weight);
    this.price = price;
  }
}
