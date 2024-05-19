package com.sunbeam;

public class BSTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTree tree = new BSTree();
		tree.addNode(8);
		tree.addNode(3);
		tree.addNode(1);
		tree.addNode(6);
		tree.addNode(4);
		tree.addNode(7);
		tree.addNode(10);
		tree.addNode(14);
		tree.addNode(13);
		tree.printParent(3);
		
		

//	
//		tree.preOrder();
//		tree.inOrder();
//		tree.postOrder();
		BSTree.Node val =tree.binarySearch(10);
		if(val==null)
			System.out.println("Key not Found");
		else
			System.out.println("key is found");

		tree.inOrder();
		tree.deleteNode(6);
		tree.inOrder();

	}

}
