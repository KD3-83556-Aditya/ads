package com.sunbeam;

public class DescendingStack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public DescendingStack(int size) {
		SIZE=size;
		arr=new int[SIZE];
		top=SIZE;
	}
	
	public void push(int value) {
		top--;
		arr[top]=value;
	}
	
	public int pop() {
		top++;
	return arr[top-1];	
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top==0;
	}

	public boolean isEmpty() {
		return top==SIZE;
	}
	

}
