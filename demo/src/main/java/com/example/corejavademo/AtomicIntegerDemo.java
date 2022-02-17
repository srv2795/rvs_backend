package com.example.corejavademo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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

class AtomicIntegerDemo1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        AtomicCountTest countTest = new AtomicCountTest();

        Runnable r1 = () -> {
            countTest.getCounter();
        };

        Runnable r2 = () -> {
            System.out.println("Count : "+ countTest.getCounter());
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        service.submit(t1);
        service.submit(t2);
        service.shutdown();
    }
}

class AtomicCountTest {
    AtomicInteger num = new AtomicInteger();

    public AtomicInteger getCounter() {
        for(int i=1;i<=1000;i++) {
            num.getAndIncrement();
        }
        return num;
    }
}