package com.example.array;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i: arr)
            arr[i] = sc.nextInt();
        System.out.println();
        System.out.println("Array taken from user input.");

    }
}
