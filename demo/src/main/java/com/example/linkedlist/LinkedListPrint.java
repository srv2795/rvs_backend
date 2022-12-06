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
}
