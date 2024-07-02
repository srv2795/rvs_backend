package com.example.array;

public class LeaderInArray {

    public static void main(String[] args) {
        int[] arr = {5,8,2,6,7,0,4};
        new LeaderInArray().getLeader(arr);
    }

    public void getLeader(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            int j;
            for(j=i+1;j<arr.length;j++) {
                if (arr[i] <= arr[j]){
                    break;
                }
            }
            if(j == arr.length) {
                System.out.print(arr[i]+" ");
            }
        }
    }

}