package com.example.corejavademo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    public static void main(String[] args) throws InterruptedException {
        Mythread mythread = new Mythread();
        Thread t1 = new Thread(mythread);
        Thread t2 = new Thread(mythread);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter value is : "+ mythread.count);
    }
}


class Mythread extends Thread {
    AtomicInteger count;

    Mythread() {
        count = new AtomicInteger();
    }

    @Override
    public void run() {
        int max_num = 2000000;
        for(int i=0;i<max_num;i++) {
            System.out.println(count.getAndIncrement());
        }
    }
}