package com.example.array;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        boolean[] b = getPrime(arr.length);
        for(int i=0;i<arr.length+1;i++) {
            System.out.println(i +" : "+ b[i]);
        }

    }

    private static boolean[] getPrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i*i<=n;i++) {
            for(int j=2*i;j<=n;j+=i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
