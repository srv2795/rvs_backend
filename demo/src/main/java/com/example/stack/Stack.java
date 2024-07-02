package com.example.stack;

public class Stack {
    int top = -1;

    public int[] push(int element, int[] arr) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full.");
        } else {
            top++;
            arr[top] = element;
        }
        return arr;
    }

    public void pop(int[] arr) {
        if(top == -1) {
            System.out.println("Stack is empty.");
        } else {
            int item = arr[top];
            arr[top] = 0;
            top--;
            System.out.println("Popped item: "+ item);
        }
    }
}
