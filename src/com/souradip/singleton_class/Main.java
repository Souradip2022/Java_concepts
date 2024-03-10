package com.souradip.singleton_class;

public class Main {

  public static void main(String[] args) {

    //Singleton obj = new Singleton();  //Singleton constructor cannot be accessed from main class because it is private

    Singleton obj1 = Singleton.newInstance("Souradip");
    Singleton obj2 = Singleton.newInstance("Anubhav");

    //Singleton() constructor cannot be called as it is declared as private
    //Singleton obj3 = new Singleton("Samyabrata"); //Will give error

    //Both obj1 and obj2 will give the same output ie: Souradip because only one object is created
    System.out.println(obj1.name);
    System.out.println(obj2.name);
  }
}
