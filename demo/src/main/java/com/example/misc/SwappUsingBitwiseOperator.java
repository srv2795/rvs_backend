package com.example.misc;

import java.util.Scanner;

public class SwappUsingBitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.print("Enter first no a : ");
        a = sc.nextInt();
        System.out.print("Enter second number b : ");
        b = sc.nextInt();
        swap(a, b);
    }
    public static void swap(int a, int b) {
        System.out.println("Before swapping a = "+ a +" and b ="+ b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping a = "+ a +" and b ="+ b);
    }
}
