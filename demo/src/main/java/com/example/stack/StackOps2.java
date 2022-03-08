package com.example.stack;

public class StackOps2 {
    public static void main(String[] args) {
        ArrayImplStack2 stack2 = new ArrayImplStack2();
        stack2.checkEmpty();
        System.out.println("push operation");
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.checkEmpty();
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        System.out.println("Stack size is : "+ stack2.size());
        System.out.println("pop operation");
        stack2.pop();
        stack2.pop();
        int data = stack2.peek();
        System.out.println("peek element is : "+ data);
        stack2.pop();
        stack2.pop();
        stack2.pop();
        stack2.checkEmpty();
        System.out.println("Stack size now : "+ stack2.size());
        stack2.push(6);
        stack2.push(7);
        stack2.push(8);
        System.out.println("Stack size now : "+ stack2.size());
        System.out.println("peek element is  : "+ stack2.peek());
    }
}

class ArrayImplStack2 {
    int top = -1;
    int[] stack2 = new int[5];

    public void push(int item) {
        if(top == stack2.length - 1) {
            System.out.println("Stack is overflown...");
        } else {
            top++;
            stack2[top] = item;
        }
        // printing the stack
        for (int element : stack2) {
            System.out.print(element+ "  ");
        }
        System.out.println();
    }

    public void pop() {
        int data = 0;
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            data = stack2[top];
            stack2[top] = 0;
            top--;
        }
        System.out.println("poped element : " + data);
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        int data =stack2[top];
        return data;
    }

    public void checkEmpty() {
        if(top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}