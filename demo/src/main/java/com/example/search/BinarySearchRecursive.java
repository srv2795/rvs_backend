package com.example.search;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] brr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Given array :");
        for (int num : brr) {
            System.out.print(num + "  ");
        }
        System.out.println();
        System.out.println("Enter the element you want to search.");
        int number = new Scanner(System.in).nextInt();
        int index = binarySearchRecursive(brr, number, 0, brr.length - 1);
        if (index != -1) {
            System.out.println(number + " is found at " + (index+1) + "th location");
        } else {
            System.out.println(number + " is not found in the array");
        }
    }

    // binary search in a recursive way.
    public static int binarySearchRecursive(int[] arr, int key, int first, int last) {
        while(first <= last) {
            int mid = (first+last)/2;
            if(key < arr[mid]) {
                return binarySearchRecursive(arr, key, first, mid-1);
            } else if(key > arr[mid]) {
                return binarySearchRecursive(arr, key, mid+1, last);
            } else if(key == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}