package com.example.pattern;

public class ViewPattern {
    public static void main(String[] args) {
        int[] arr = new int[5];
        showPattern1(arr);

    }

    private static void showPattern1(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr.length);
            }
            System.out.println();
        }


    }
}
