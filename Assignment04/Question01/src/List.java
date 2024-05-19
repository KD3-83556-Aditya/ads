
public class List {
	static class Node{
		private int data;
		private Node next;
		//private Node prev;
		public Node(int value) {
			data = value;
			next = null;
			//prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	public void addFirst(int value) {
		if(isEmpty())
		{
			Node newnode = new Node(value);
			newnode.next=head;
			head=newnode;
			tail=newnode;
		}
		else
		{
			Node newnode = new Node(value);
			newnode.next=head;
			head=newnode;
			
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

	public void deleteLast() {
		if(isEmpty())
			return;
		else
		{
			Node trav= head;
			while(trav.next!=tail)
				trav=trav.next;
			tail=trav;
			trav.next=null;
			
		}
	}
	
	public void addLast(int value) {
		Node newnode=new Node(value);
		tail.next = newnode;
        tail = newnode;
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		System.out.print("");
	}
		
	

}
}
