package com.sunbeam;

public class SinglyLinkListmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new List();
		l1.addFirst(1);
		l1.addFirst(11);
		l1.addFirst(22);
//		l1.deleteFirst();
		//l1.deletelast();
		
		l1.addLast(100);
//		l1.deleteAll();
		l1.addPosition(200, 2);
		l1.deletePosition(1);
		

		l1.displayReverse();

	}
	


}
