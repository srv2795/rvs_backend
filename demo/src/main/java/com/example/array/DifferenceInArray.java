package com.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferenceInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7, 8,9};
        int[] brr = {3,2,1,4, 8};
        Arrays.sort(arr);
        Arrays.sort(brr);
        Object[] drr = arrayDifference(arr, brr);
        for(Object x : drr) {
            System.out.print(x + " ");
        }
    }

    private static Object[] arrayDifference(int[] arr, int[] brr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int a : arr) {
            set.add(a);
        }
        for(int a : brr) {
            set2.add(a);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int b : arr) {
            if(!set2.contains(b)) {
                list.add(b);
            }
        }
        for(int b : brr) {
            if(!set.contains(b)) {
                list.add(b);
            }
        }
        return list.toArray();

    }
}
