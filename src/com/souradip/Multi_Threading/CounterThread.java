package com.souradip.Multi_Threading;

class Count {
    private int countchk;

    public synchronized void check() {
        countchk++;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // Optionally, handle the InterruptedException here
        }
    }

    public int getCountchk() {
        return countchk;
    }
}

public class CounterThread {
    public static void main(String[] args) throws InterruptedException {
        Count ob = new Count();
        int lb = 10, ub = 15;
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = lb; i <= ub; i++) {
                    ob.check();
                }
            }
        });
        th1.start();
        th1.join(); // Wait for the thread to finish

        System.out.println("Count: " + ob.getCountchk());
    }
}
