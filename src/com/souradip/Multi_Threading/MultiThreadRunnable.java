package com.souradip.Multi_Threading;

class MyThreadRunnable1 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 40000; i++) {
      System.out.println("I am thread1");
    }
  }
}

class MyThreadRunnable2 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 40000; i++) {
      System.out.println("T am thread2 ");
    }
  }
}

public class MultiThreadRunnable {
  public static void main(String[] args) {

    MyThreadRunnable1 rn1 = new MyThreadRunnable1();
    Thread th1 = new Thread(rn1);
    MyThreadRunnable2 rn2 = new MyThreadRunnable2();
    Thread th2 = new Thread(rn2);
    th1.start();
    th2.start();

  }
}
