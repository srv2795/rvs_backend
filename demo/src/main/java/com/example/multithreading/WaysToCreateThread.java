package com.example.multithreading;

public class WaysToCreateThread {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        Thread t1 = new Thread(customThread);
        Thread t2 = new Thread(customThread);
        t1.start();
        t2.start();

    }
}

class CustomThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Thread name : "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class customThread2 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Thread using runnable :" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
