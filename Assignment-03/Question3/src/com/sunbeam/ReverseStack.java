package com.sunbeam;

public class ReverseStack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public ReverseStack(int size) {
		SIZE=size;
		arr=new int[SIZE];
		top=-1;
	}
	
	public void push(int value) {
		top++;
		arr[top]=value;
	}
	
	public int pop() {
		
	return arr[top-1];	
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top==SIZE-1;
	}

	public boolean isEmpty() {
		return top==-1;
	}
	

}
