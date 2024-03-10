package com.souradip.static_example;

public class Main {

  public static void main(String[] args) {

    fun(); //Calling static fun() without creating object

    Main funN = new Main();
    funN.funNew();

    //System.out.println(Main.fun());
    System.out.println(fun()); // Both the lines means the same
  }

  static String fun () {
    // greeting();
    /*Non static method greeting() cannot be referenced/accessed from a static method fun()
    without creating object for greeting() */

    Main fun1 = new Main();
    fun1.greeting();
    return "Call successful";
  }

  void funNew () {
    greeting();  //Both funNew() and greeting() are non static members so no need to create object for greeting()
    //greeting() will use object of funNew() when called
  }

  void greeting () {

    //fun(); //Static member fun() can be called from non static method
    System.out.println("Hello World");
  }
}
