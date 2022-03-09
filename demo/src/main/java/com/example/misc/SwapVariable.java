package com.example.misc;

import java.util.Scanner;

public class SwapVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("first one is: "+ a +" and second one is: "+ b);
        new SwapVariable().swapWIthThreeVar(a, b);
        new SwapVariable().swapWithTwoVar(a, b);
    }

    public void swapWIthThreeVar(int num1, int num2) {
        System.out.println("--------------swap with three varibles--------------");
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping these two values :");
        System.out.println("first one is: "+num1+" and second one is: "+ num2);
    }

    public void swapWithTwoVar(int num1, int num2) {
        System.out.println("--------------swap without three varibles--------------");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("first one is: "+num1+" and second one is: "+ num2);
    }
}


