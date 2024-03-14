package com.example.stack;

public class StackOps {
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);

        System.out.println("Stack1 size will be : "+ stack1.size());

        for(int i=0;i<5;i++) {
            System.out.println(stack1.pop() + " is poped from stack1.");
        }
        System.out.println("stack1 size will be : "+ stack1.size());
        System.out.println("Again trying to pop one element: ");
        stack1.pop();

        System.out.println("Again data is pushed into stack1: ");
        stack1.push(7);
        stack1.push(8);
        stack1.push(9);
        System.out.println("performing peek operation : "+ stack1.peek());
        System.out.println("Again stack1 size will be : "+ stack1.size());
    }
}

class Stack1 {
    private int[] stack = new int[5];
    int top=0;

    public void push(int item) {
        System.out.println("PUSH Operation");
        if(top == (stack.length)) {
            System.out.println("Stack1 is overflown.");
        } else {
            stack[top] = item;
            top++;
        }
        for(int element : stack) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public int pop() {
        System.out.println("POP Operation");
        int data=0;
        if(top == 0) {
            System.out.println("Stack1 is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    public int peek() {
        System.out.println("PEEK Operation");
        int data = stack[top-1];
        return data;
    }

    public int size() {
        return top;
    }



}
