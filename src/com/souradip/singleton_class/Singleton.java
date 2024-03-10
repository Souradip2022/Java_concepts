package com.souradip.singleton_class;

public class Singleton {
  String name;
  private Singleton (String name) {
    this.name = name;
  }
  private static Singleton instance;

  public static Singleton newInstance (String name) {
    //Checks whether 1 object is created or not
    if(instance == null) {
      instance = new Singleton(name);
    }
    return instance;
  }
}
