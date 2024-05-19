package com.sunbeam;

//import javax.sound.sampled.Line;

public class LinearQueue {
	private int SIZE;
	private int front;
	private int rear;
	private int arr[];
	
	public LinearQueue(int size) {
		SIZE =size;
		front=rear=0;
		arr=new int[SIZE];
	}
	
	public void push(int value) {
		System.out.println("Before increment : "+rear);
		
		
		arr[rear]=value;
		rear++;
		System.out.println("After increment : "+rear);
	}
	
	public void pop() {
		front++;
	}
	
	public int peek() {
		return arr[front+1];
	}
	
	public boolean isFull() {
		return rear==SIZE-1;
		
	}
	
	public boolean isEmpty() {
		return rear==front;
	}

	

}
