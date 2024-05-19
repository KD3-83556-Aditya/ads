package com.sunbeam;

public class List {
    private static class Node {
        int data;
        Node next;

       public Node(int value) {
            data = value;
            next = null;
        }
    }
    private Node head; 

    public void reverseList() {
       
        Node t1 = head;
        Node t2 = head.next; 
        Node t3=null;

        while (t2 != null) {
            t3 = t2.next; 
            t2.next = t1; 
            t1 = t2; 
            t2 = t3;
        }
        head.next=null;
        head = t1; 
    }

   

}
