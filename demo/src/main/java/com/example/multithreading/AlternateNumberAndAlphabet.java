package com.example.multithreading;

public class AlternateNumberAndAlphabet {
    private static boolean flag = true;
    private static Object obj = new Object();
    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            for(int i=1;i<=26;i++) {
                synchronized (obj) {
                    if(!flag) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " +i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    flag = false;
                    obj.notify();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(char i='A';i<='Z';i++) {
                synchronized (obj) {
                    if(flag) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " +i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    flag = true;
                    obj.notify();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
