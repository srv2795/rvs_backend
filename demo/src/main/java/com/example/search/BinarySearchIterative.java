package com.example.search;

import java.util.Scanner;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0;i<5;i++) {
            arr[i] = i;
        }
        System.out.println("Print the array..");
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Enter the element you want to search in array.");
        int number = new Scanner(System.in).nextInt();
        int index = binarSearch(arr, number);
        if(index != -1 && index != 0) {
            System.out.println(number + " is found in array at "+(index+1) +"th position.");
        } else if (index == 0) {
            System.out.println(number + " is found in array at "+(index+1) +"st position.");
        } else {
            System.out.println(number + " is not found in array.");
        }

    }

    public static int binarSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low <= high) {
            mid = (low + high)/2;
            if(key == arr[mid]) {
                return mid;
            } else if(key < mid) {
                high = mid - 1;
            } else if(key > mid) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
