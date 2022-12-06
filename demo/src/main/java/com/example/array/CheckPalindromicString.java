package com.example.array;

import java.util.Scanner;

public class CheckPalindromicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(checkForPalindrome(str)) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }

    }

    public static boolean checkForPalindrome(String str) {
        char[] arr = str.toCharArray();
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while(firstIndex < lastIndex) {
            if(arr[firstIndex] != arr[lastIndex]) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}
