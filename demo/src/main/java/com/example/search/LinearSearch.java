package com.example.search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user array : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search in array : ");
        int key  = sc.nextInt();
        new LinearSearch().linearSearch(arr, key);
        if(new LinearSearch().linearSearch(arr, key) == true) {
            System.out.println(key + " is found in the array.");
        } else  {
            System.out.println(key + " is not found in the array.");
        }
    }

    private boolean linearSearch(int arr[], int key) {
        boolean flag = false;
        for(int i=0 ; i<arr.length ; i++) {
            if(key == arr[i]) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
