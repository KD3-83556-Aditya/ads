
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
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node newnode=new Node(value);
		newnode.next=head;
		head=newnode;

	}
		
	public void deleteLast() {
		if(isEmpty())
		return;
		else {
			head=head.next;
		}
	}
	
	public void display() {
		Node trav=head;
		System.out.println("List: ");
		while(trav!=null)
		System.out.print(trav.data);
		trav=trav.next;
		System.out.print(" ");

		
	}

	public int getHeadData() {
		
		return head.data;
	}

}
