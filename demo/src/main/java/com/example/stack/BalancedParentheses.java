package com.example.stack;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = ")(4)()+3*(3-2)+(25/5)";
        balancedParentheses(str.toCharArray());
    }

    public static void balancedParentheses(char[] arr) {
        Stack<Character> stack = new Stack<>();
        int top = -1;
        for(char character : arr) {
            if(String.valueOf(character) == "(") {
                if(top == arr.length - 1)
                    System.out.println("Stack is overflown.");
                else {
                    stack.push(character);
                    top++;
                }
            } else if(!stack.empty()) {
                stack.pop();
                top--;
            }
        }
        if(stack.empty()) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are not balanced");
        }

    }

    /*public int[] insertionSort(int[] arr) {
        for(int i=1;i<arr.length; ++i){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] < key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }*/
}
