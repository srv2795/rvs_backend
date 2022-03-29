package com.example.linkedlist;

import java.util.Iterator;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        l.head = n1;
        n1.setNext(n2);
        n2.setNext(n3);
        l.printList();
    }
}

class LinkedList {
    Node head;

    public void printList() {
        Node n = head;
        head.setNext(n);

    }
}

class Node {
    private int data;
     private Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
