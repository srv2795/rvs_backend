package com.example.array;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        boolean flag = false;
        int[][] arr = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrray elements : ");
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input array will be : ");
        for(int j=0;j<4;j++) {
            for(int k=0;k<4;k++) {
                System.out.print(arr[j][k]+ "  ");
                if(j == k && arr[j][k] == 1) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
            System.out.println();
        }
        if(flag) {
            System.out.println("The above matrix is a diagonal matrix.");
        } else {
            System.out.println("The above matrix is not a diagonal matrix.");
        }

    }
}