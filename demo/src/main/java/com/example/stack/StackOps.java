package com.example.stack;

public class StackOps {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Stack size will be : "+ stack.size());

        for(int i=0;i<5;i++) {
            System.out.println(stack.pop() + " is poped from stack.");
        }
        System.out.println("stack size will be : "+ stack.size());
        System.out.println("Again trying to pop one element: ");
        stack.pop();

        System.out.println("Again data is pushed into stack: ");
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println("performing peek operation : "+ stack.peek());
        System.out.println("Again stack size will be : "+ stack.size());
    }
}

class Stack {
    private int[] stack = new int[5];
    int top=0;

    public void push(int item) {
        System.out.println("PUSH Operation");
        if(top == (stack.length)) {
            System.out.println("Stack is overflown.");
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
            System.out.println("Stack is empty");
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
