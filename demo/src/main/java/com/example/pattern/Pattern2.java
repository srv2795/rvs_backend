package com.example.pattern;

public class Pattern2 {
    public static void main(String[] args) {
        printPattern1(4);
        System.out.println("----------------------------------");
        printPattern2(4);
        System.out.println("----------------------------------");
        printPattern3(4);
    }

    static void printPattern1(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printPattern2(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void printPattern3(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
