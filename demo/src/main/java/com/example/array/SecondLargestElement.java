package com.example.array;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,6,8,3,9,4,0,5,7,2};
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        printSecondLarge(sort(arr));
    }

    public static void printSecondLarge(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("second largest element : " + arr[arr.length - 2]);

    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int k = arr[i+1];
            if(arr[i] > arr[i+1]) {
                arr[i+1] = arr[i];
                arr[i] = k;
            }
        }
        return arr;
    }
}
