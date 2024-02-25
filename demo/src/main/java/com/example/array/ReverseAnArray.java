package com.example.array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,4,6};
        int[] brr = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i>=0;i--) {
            int temp = arr[i];
            brr[j] = temp;
            j++;
        }
        for (int k : brr) {
            System.out.print(k + " ");
        }
    }
}
