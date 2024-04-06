package com.souradip.Inner_class_types;

public class Static_class {
  static class Nested_Demo {
    public void my_method() {
      System.out.println("This is my nested class");
    }
  }
  public static void main(String args[]) {
    Static_class.Nested_Demo nested = new Static_class.Nested_Demo();
    nested.my_method();
  }
}

class Main extends Static_class {
  /*public static void main(String[] args) {
    Nested_Demo nested2 = new Nested_Demo();
    nested2.my_method();
  }*/
}

class Main2 {
  public static void main(String[] args) {
    /*Static_class.Nested_Demo nested3 = new Static_class.Nested_Demo();
    nested3.my_method();*/
  }
}