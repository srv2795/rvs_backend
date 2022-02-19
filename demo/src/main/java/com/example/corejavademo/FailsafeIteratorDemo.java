package com.example.corejavademo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailsafeIteratorDemo extends Thread {
    //this is a fail-fast iterator
    static List<String> strList = new ArrayList<>();
    //uncomment line: 12 and comment line: 10 to get the fail-safe iterator.
    //static List<String> strList = new CopyOnWriteArrayList<>();
    public void run() {
        strList.add("RNSingh");
    }

    public static void main(String[] args) throws InterruptedException {
        FailsafeIteratorDemo failsafeIteratorDemo = new FailsafeIteratorDemo();
        strList.add("ashu");
        strList.add("himanshu");
        strList.add("chetan");
        strList.add("roli");
        strList.add("saroj");
        failsafeIteratorDemo.start();

        Iterator<String> itr = strList.iterator();
        while(itr.hasNext()) {
            String name = itr.next();
            System.out.println("name : "+ name);
        }
        Thread.sleep(1000);
    }
}
