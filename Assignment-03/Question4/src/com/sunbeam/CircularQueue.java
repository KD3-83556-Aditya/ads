package com.sunbeam;

public class CircularQueue {
    private int arr[];
    private int front, rear;
    private final int SIZE;
    private int count;

    public CircularQueue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = rear = -1;
        count = 0;
    }
    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty())
            front = rear = 0;
        else
            rear = (rear + 1) % SIZE;
        arr[rear] = value;
        count++;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = arr[front];
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % SIZE;
        count--;
        System.out.println("count:"+count);
        return temp;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == SIZE;
    }
}
