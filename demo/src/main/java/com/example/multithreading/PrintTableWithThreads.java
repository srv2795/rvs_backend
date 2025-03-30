package com.example.multithreading;

import lombok.Synchronized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintTableWithThreads {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2,3, 4, 5, 6, 7, 8, 9, 0);
        Object obj = new Object();

        PrintTableWithThreads p = new PrintTableWithThreads();

        Thread t1 = new Thread(() -> {

            p.getEven(list);
        });

        Thread t2 = new Thread(() -> {
            p.getOdd(list);
        });

        t1.start();
        t2.start();

    }

    private void getEven(List<Integer> list) {
        for(int number : list) {
            if(number%2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + number);
            }
        }
    }

    private void getOdd(List<Integer> list) {
        for(int number : list) {
            if(number%2 != 0) {
                System.out.println(Thread.currentThread().getName() + " : " + number);
            }
        }
    }


}
