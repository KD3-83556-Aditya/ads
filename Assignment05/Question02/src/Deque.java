
public class Deque {

		// TODO Auto-generated method stub
		List l1;
		
		public Deque() {
			l1=new List();
		}
		
		public void InsertFront(int value) {
			l1.addFirst(value);
			
		}
		
		
		public void RemoveFront() {
			l1.deleteFirst();
		}
		
		public void InsertRear(int value) {
			l1.addLast(value);
		}
		
		public void RemoveRear() {
			l1.deleteLast();
		}
		
		public int  front() {
			return l1.getFrontData();
		}
		
		public int  rear() {
			return l1.getReardata();
		}
	
	
	}


