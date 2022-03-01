package com.example.array;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The size of array is  : 4 * 4");
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++) {
                    System.out.print(arr[i][j] + " ");
            }
        }
}
