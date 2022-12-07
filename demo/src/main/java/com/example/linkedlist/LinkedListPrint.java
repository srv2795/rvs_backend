package com.example.linkedlist;

public class LinkedListPrint {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListPrint llp = new LinkedListPrint();
        llp.head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(6);

        llp.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // display linkedlist elements
        llp.display();

        // find length of linked list
        System.out.println("length of singly linked list : "+ llp.lengthOfLinkedList());

        // Insert node at beginning
        System.out.println(7 + " is inserted at beginning of linked list ");
        llp.insertNodeAtBeginning(7);
        llp.display();

        // insert node at last
        System.out.println(8 +" is inserted at last of linked list.");
        llp.insertAtLast(8);
        llp.display();

        // insert at given index of linked list.
        System.out.println(9 + " is inserted at "+ 4 +"th index");
        llp.insertNodeInBetweenLinkedList(9, 4);
        llp.display();
    }

    public void display() {
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    int lengthOfLinkedList() {
        if(head == null) {
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertNodeAtBeginning(int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    public void insertAtLast(int data) {
        ListNode newNode = new ListNode(8);
        if(head == null) {
            head.next = newNode;
            return;
        }
        ListNode curent = head;
        while(curent.next != null) {
            curent = curent.next;
        }
        curent.next = newNode;
    }

    public void insertNodeInBetweenLinkedList(int data, int location) {
        ListNode newNode = new ListNode(data);
        int index = 1;
        if(index == location) {
            head.next = newNode;
        }
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
            if(index == location - 1) {
                break;
            }
            index++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

}
