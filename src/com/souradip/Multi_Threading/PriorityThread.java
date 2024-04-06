package com.souradip.Multi_Threading;

import java.awt.*;

class PrThread implements Runnable{
  String name;

  public PrThread(String name) {
    this.name = name;
  }

  public void run() {
    for (int i = 0; i < 400; i++) {
      System.out.println("Thread " + name + " is running");
    }
  }
}

public class PriorityThread {
  public static void main(String[] args) {
    PrThread thread1 = new PrThread("Thread1");
    PrThread thread2 = new PrThread("Thread2");
    PrThread thread3 = new PrThread("Thread3");
    PrThread thread4 = new PrThread("Thread4");

    Thread t1 = new Thread(thread1);
    Thread t2 = new Thread(thread2);
    Thread t3 = new Thread(thread3);

    t1.setPriority(4);
    t2.setPriority(3);
    t3.setPriority(2);

    t1.start();
    t2.start();
    t3.start();
  }
}
