
package com.sunbeam;

public class Stack {
    private int arr[];
    private int top;
    private final int SIZE;

    public Stack(int size) {
        SIZE = size;
        arr = new int[SIZE];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        int value = arr[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return arr[top];
    }

    public boolean isFull() {
        return top == SIZE - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    
    public int max() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        int max = arr[0];
        for (int i = 1; i <= top; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

