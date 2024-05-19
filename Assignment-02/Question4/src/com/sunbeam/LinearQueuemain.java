package com.sunbeam;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class LinearQueuemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearQueue q = new LinearQueue(4);
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("0.EXIT/n 1.PUSH/n 2.POP/n 3.PEEK");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: if(q.isFull()) {
				System.out.println("Queue is Full");
			}
			else
			{
				System.out.println("Enter a value to be added in a queue");
				int value=sc.nextInt();
				q.push(value);
			}
				break;
				
			case 2: if(q.isEmpty()) {
				System.out.println("Queue is Empty");
			}
			else
			{
				q.pop();
			}
				break;
			
			case 3: if(q.isEmpty()) {
				System.out.println("Queue is Empty");
			}
			else
			{
				System.out.println("Peeked value is -"+q.peek());
			}
				break;
			}
			
		}
		while(choice!=0);
		sc.close();
		

	}

}
