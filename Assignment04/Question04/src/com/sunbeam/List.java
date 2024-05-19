package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data=value;
			next=null;
			
		}
		
	}
	
	private Node head;
	public List() {
		head=null;
	}

	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next=head;
		head=newnode;
		
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head=newnode;
		else
		{
			Node trav=head;
			while(trav.next!=null)
			trav=trav.next;
			trav.next=newnode;
			
			
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else
		{
			head=head.next;
		}
	}
	
	public void deletelast() {
		if(isEmpty())
			return;
		else if(head.next==null)
			head=null;
		else
		{
			Node trav=head;
			while(trav.next.next!=null)
				trav=trav.next;
			trav.next=null;
		}
	}
	
	public void deleteAll() {
		head=null;
		System.out.println("List is empty now, all nodes are deleted");
	}
	
	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if(isEmpty()) 
			return;
		else if(pos<=1)
			addFirst(value);
		else
		{
			Node trav = head;
			for (int i=1; i<pos-1 && trav.next!=null; i++)
				trav=trav.next;
			newnode.next=trav.next;
			trav.next=newnode;
		}
	}
	
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(pos<=1)
			deleteFirst();
		else
		{
			Node trav = head;
			for(int i=1; i<pos-1 && trav.next.next!=null;i++)
				trav=trav.next;
			trav.next=trav.next.next;
		}
		
	}
	public void displayReverse(Node node) {
	    if (node == null) {
	        return;
	    }
	    displayReverse(node.next);
	    System.out.print(node.data + " ");
	}

	public void displayReverse() {
	    System.out.println("List in reverse order:");
	    displayReverse(head);
	    System.out.println(); 
	}

}
