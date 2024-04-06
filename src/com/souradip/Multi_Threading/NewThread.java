package com.souradip.Multi_Threading;

class MyThread1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 40000; i++) {
      System.out.println("Thread1 is running");
    }
  }
}

class MyThread2 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 40000; i++) {
      System.out.println("Thread2 is running");
    }
  }
}

public class NewThread {
  public static void main(String[] args) {
    MyThread1 th1 = new MyThread1();
    MyThread2 th2 = new MyThread2();
    th1.start();
    try {
      th1.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e.getMessage());
    }
    th2.start();
  }
}
