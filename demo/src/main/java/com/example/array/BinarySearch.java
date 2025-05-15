package com.example.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 7;
        System.out.println(num + " is found at " + getElementBinarySearch(arr, num) +  " location.");
    }

    private static int getElementBinarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(num == arr[mid]) {
                return mid;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return -1;
    }
}
