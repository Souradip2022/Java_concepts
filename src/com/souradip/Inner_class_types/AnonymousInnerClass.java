// The code defines an interface `Message` with a method `greet()`. It then creates an anonymous class implementing the `Message` interface to print a greeting message "Hi Souradip!".
package com.souradip.Inner_class_types;

import org.w3c.dom.ls.LSOutput;

interface Message {
  String greet();
  int i = 0;
  String greet(String message);

}

public class AnonymousInnerClass implements Message{
  // method which accepts the object of interface Message

  public static void main(String args[]) {
    // Instantiating the class
    Message m1 = new Message() {
      @Override
      public String greet() {
        return "Hi Souradip!";
      }

      public String greet(String message) {
        return message;
      }
    };
    System.out.println(m1.greet());
    System.out.println(m1.i);
  }

  @Override
  public String greet() {
    return "";
  }

  @Override
  public String greet(String message) {
    return "";
  }
}