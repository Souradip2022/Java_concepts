package com.souradip.packages; //Import is not required because both Main and Human class exists in the same directory

public class Main {
  public static void main(String[] args) {

    Human souradip = new Human();
    Human anubhav = new Human(19, 800000, "Anubhav", false);
    Human samyabrata = new Human(20, 800000, "Samyabrata", false);

    System.out.println(Human.population);
    //System.out.println(anubhav.population);  //It is not suitable to access static data members via instance reference;
    System.out.println(souradip.age);
    System.out.println(samyabrata.age);
    System.out.println(Human.count);
  }
}
