package com.souradip.protected_access;

//protected members and methods can be accessed anywhere from the same package and from inherited class from different packages
public class SuperClass {

  static int a1;
  protected int a2;
  //int a2; //Default access modifier allows members and methods to be accessed anywhere
  // from same package but not from any outside package
  static double b1;
  protected double b2;
  //private double b2; //private access modifier allows members and methods to be accessed only in the same file
  //No other files even from the same package can access the protected variables and methods
  static boolean c1;
  protected boolean c2;
  static String s1;
  private String s2;

  public SuperClass() {

  }

  public static void main(String[] args) {
    System.out.println(a1 + " " + b1 + " " + c1 + " " + s1);

    int k;
    //Error because k is a local variable and needs to be initialised for both static amd non-static function
    //System.out.println(k);

    SuperClass obj1 = new SuperClass();
    obj1.init();
    System.out.println(obj1.a2); //Using obj1 to use non-static variable in static main
  }

  public SuperClass(int a2, double b2, boolean c2, String s2) {
    this.b2 = b2;
    this.c2 = c2;
    this.s2 = s2;
    this.a2 = a2;
  }

  public void init() {

    System.out.println(a2 + " " + b2 + " " + c2 + " " + s2);
    //System.out.println(this.a2 + " " + this.b2 + " " + this.c2 + " " + this.s2);
  }
}