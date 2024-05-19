
public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			data=value;
			next=null;
			prev=null;
		}
	}
	
private Node head;
private Node tail;

public List() {
	head=null;
	tail=null;
}

public boolean isEmpty() {
	return head==null && tail==null;
}
public void addFirst(int value) {
	Node newnode = new Node(value);
	if(isEmpty())
	{
		head=newnode;
		newnode.next=newnode.prev=head;
	}
		else
		{
			newnode.next=head;
			
			newnode.prev=head.prev;
			head.next.prev=newnode;
			head.prev=newnode;
			head=newnode;
		}
}

public void addLast(int value) {
	Node newnode=new Node(value);
	if(isEmpty())
	{
		head=newnode;
		newnode.next=newnode.prev=head;
	}
	else
	{
		newnode.next=head;
		
		newnode.prev=head.prev;
		head.next.prev=newnode;
		head.prev=newnode;
		
	}
}


public void deleteFirst() {
	if(isEmpty())
		return;
	else if(head==null)
		head=null;
	else
	{
		head.prev.next=head.next;
		head.next.prev=head.prev;
		head=head.next;

		
	}
	
}

public int getReardata() {
	if(isEmpty())
		return -1;
	else
	return head.prev.data;
}



public int getFrontData() {
	if(isEmpty())
		return -1;
	else
	return head.data;
}

public void deleteLast() {
	if(isEmpty())
		return;
	else if(head==null)
		head=null;
	else
	{
		head.prev.prev.next=head;
		head.prev=head.prev.prev;
	}
}
}
