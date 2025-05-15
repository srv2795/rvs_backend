package com.example.array;

import java.util.Arrays;

public class LeftRotateDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("rotate array by 3");
        leftRotate(arr, 3);
        System.out.println(Arrays.toString(arr));

    }

    private static void leftRotate(int[] arr, int d) {
        int n = arr.length - 1;
        reverse(arr,0,d-1);
        reverse(arr, d, n);
        reverse(arr, 0, n);

    }

    private static void reverse(int[] arr, int i, int j) {
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
