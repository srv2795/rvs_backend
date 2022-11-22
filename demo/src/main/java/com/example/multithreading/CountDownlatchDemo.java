package com.example.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownlatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        Mythread t1 = new Mythread(1000, latch ,"Thread1");
        Mythread t2 = new Mythread(2000, latch ,"Thread2");
        Mythread t3 = new Mythread(3000, latch ,"Thread3");
        Mythread t4 = new Mythread(4000, latch ,"Thread4");
        Mythread t5 = new Mythread(5000, latch ,"Thread5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        latch.await();
        System.out.println(Thread.currentThread().getName() + " has finished its execution now.");
    }
}

class Mythread extends Thread {
    private int delay;
    private CountDownLatch latch;

    public Mythread(int delay, CountDownLatch latch, String name) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    public void run() {
        try{
            Thread.sleep(delay);
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " has finished.");
        }
        catch (Exception e ) {
            e.printStackTrace();
        }
    }
}

