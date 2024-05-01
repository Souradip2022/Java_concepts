package com.souradip.Multi_Threading;

import javax.crypto.spec.PSource;

class MyThread1 extends Thread {
  String name;
  MyThread1(String name){
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0; i < 40000; i++) {
//      System.out.println("Thread1 is running");
    }
  }
}

class MyThread2 extends Thread {

  String name;
  MyThread2(String name){
    this.name = name;
  }
  @Override
  public void run() {
    for (int i = 0; i < 40000; i++) {
//      System.out.println("Thread2 is running");
    }
  }
}

public class NewThread {
  public static void main(String[] args) {
    MyThread1 th1 = new MyThread1("Thread1");
    MyThread2 th2 = new MyThread2("Thread2");
    th1.setName("Thread first");
    th1.start();
    try {
      th1.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e.getMessage());
    }
    th2.start();

    System.out.println(th1.getName());
    System.out.println(th2.getName());
  }
}
