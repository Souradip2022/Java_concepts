package com.souradip.protected_access;

public class Subclass extends Test {

  public Subclass () {
    super();
  }
  public Subclass (int a2, double b2, boolean c2, String s2) {
    super(a2, b2, c2, s2);
  }

  public static void main(String[] args) {
    Test obj1 = new Test();
    //When data-members and methods of superclass are protected and it has subclass in different package then
    // only object of subclass can access the superclass data-members and methods
    //obj1 is object of Superclass i.e. Test so it can not access a2 in protected mode
    //int a = obj1.a2; //Error!

    Subclass obj2 = new Subclass();
    //obj2 is object of Subclass so it can access data-members from its parent class i.e. Test
    int b = obj2.a2;
  }
}

class SubSubclass extends Subclass {

  public SubSubclass () {
    super();
  }
  public SubSubclass (int a2, double b2, boolean c2, String s2) {
    super(a2, b2, c2, s2);
  }

  public static void main(String[] args) {
    Test obj1 = new Test();
    //Similar reason as of above
    //int a = obj1.a2;

    Subclass obj2 = new Subclass();
    //Similar reason as of above
    //int b = obj2.a2;

    SubSubclass obj3 = new SubSubclass();
    //obj3 is object of Subclass so it can access data-members from its parent class i.e. Subclass
    int c = obj3.a2;
  }
}
