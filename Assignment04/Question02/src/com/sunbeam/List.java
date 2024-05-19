package com.sunbeam;

public class List {
    static class Node {
        private char data;
        private Node next;

        public Node(char value) {
            data = value;
            next = null;
        }
    }

    private Node tail;
    private int count;

    public List() {
        tail = null;
        count = 0;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void addFirst(char value) {
        Node newnode = new Node(value);
        if (isEmpty()) {
            tail = newnode;
            newnode.next = newnode;
        } else {
            newnode.next = tail.next;
            tail.next = newnode;
        }
        count++;
    }

    public void addLast(char value) {
        Node newnode = new Node(value);
        if (isEmpty()) {
            tail = newnode;
            newnode.next = newnode;
        } else {
            newnode.next = tail.next;
            tail.next = newnode;
            tail = newnode;
        }
        count++;
    }

    public void addPosition(char value, int pos) {
        if (pos < 1 || pos > count + 1) {
            System.out.println("Invalid position");
            return;
        }
        // Implementation needed
    }

    public void deleteFirst() {
        if (isEmpty())
            return;
        else if (tail.next == tail)
            tail = null;
        else {
            tail.next = tail.next.next;
        }
        count--;
    }

    public void deleteLast() {
        if (isEmpty())
            return;
        else if (tail.next == tail)
            tail = null;
        else {
            Node trav = tail.next;
            while (trav.next != tail)
                trav = trav.next;
            trav.next = tail.next;
            tail = trav;
        }
        count--;
    }

    public void deletePosition(int pos) {
        if (pos < 1 || pos > count) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) { 
            deleteFirst();
            return;
        }

        Node prev = tail.next;
        for (int i = 1; i < pos - 1; i++) {
            prev = prev.next;
        }

        Node toDelete = prev.next;
        prev.next = toDelete.next;

        if (pos == count) { 
            tail = prev;
        }

        count--;
    }


    public void display() {
        if (isEmpty())
            return;
        Node trav = tail.next;
        System.out.print("List :: ");
        do {
            System.out.print(" " + trav.data);
            trav = trav.next;
        } while (trav != tail.next);
        System.out.println("");
        System.out.println("Node count : " + count);
    }

    public void deleteAll() {
        tail = null;
    }
}
