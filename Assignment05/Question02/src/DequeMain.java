
public class DequeMain {

	public static void main(String[] args) {
	    Deque dq = new Deque();
	    System.out.println("Insert at front");
	    dq.InsertFront(100);
	    System.out.println("Insert at front");
	    dq.InsertFront(200);
	    System.out.println("Insert at front");
	    dq.InsertFront(300);
	    System.out.println("Insert at rear");
	    dq.InsertRear(400);
	    System.out.println("Front value: " + dq.front());
	    System.out.println("Rear value: " + dq.rear());
	    dq.RemoveFront();
	    System.out.println("Front value: " + dq.front());
	    System.out.println("Rear value: " + dq.rear());
	    dq.RemoveRear();
	    System.out.println("Front value: " + dq.front());
	    System.out.println("Rear value: " + dq.rear());
	    dq.RemoveFront();
	    System.out.println("Front value: " + dq.front());
	    System.out.println("Rear value: " + dq.rear());
	    dq.RemoveFront();
	    System.out.println("Front value: " + dq.front());
	    System.out.println("Rear value: " + dq.rear());
	    dq.RemoveFront();
	    System.out.println("Front value: " + dq.front());
	    System.out.println("Rear value: " + dq.rear());
	}


}
