package com.example.array;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] a = {2,5,4,7,6,1,9,8,3,0};
        int k = 4;
        int n = findMax(a, k);
        System.out.println("Max element in array : "+ n);
    }

    public static int findMax(int[] arr, int m) {
        int[] crr = sortArray(arr);
        for (int y : crr) {
            System.out.print(y + " ");
        }
        for (int i =crr.length - 1 ;i >=0;i--) {
            if (i == 4-1) {
                return crr[i];
            }
        }
        return 0;
    }

    public static int[] sortArray(int[] brr) {
        for(int i=1;i<brr.length;++i) {
            int n = brr[i];
            int j = i -1;
            while (j >= 0 && n > brr[j]) {
                brr[j+1] = brr[j];
                j = j - 1;
            }
            brr[j+1] = n;
        }
        return brr;
    }
}
