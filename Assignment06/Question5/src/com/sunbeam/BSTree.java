package com.sunbeam;

import com.sunbeam.BSTree.Node;

public class BSTree {
	public static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;

			left = right = null;
		}
	}
	
	private Node root;
	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root==null;
	}
	
	public void addNode(int value) {
		Node newnode= new Node(value);
		if(isEmpty())
			root=newnode;
		else
		{
			Node trav=root;
			while(true) {
				if(value<trav.data) {
					if(trav.left==null) {
						trav.left=newnode;
						break;
					}
					else
					{
						trav=trav.left;
					}
				}
				else
				{
					if(trav.right==null) {
						trav.right=newnode;
						break;
						
					}
					else
					{
						trav=trav.right;
					}
				}
			}
		}
	}
		
		public void preOrder(Node trav) {
			if(trav==null)
				return;
			System.out.print(trav.data);
			preOrder(trav.left);
			preOrder(trav.right);
			
		}
		public void preOrder() {
			System.out.print("Preorder : ");
			preOrder(root);
			System.out.print(" ");
		}
		
		public void inOrder(Node trav) {
			if(trav==null)
				return;
			inOrder(trav.left);
			System.out.print(trav.data);
			inOrder(trav.right);
			
			
		}
		
		public void inOrder() {
			System.out.print("Inorder: ");
			inOrder(root);
			
		}
		
		public void postOrder(Node trav) {
			if(trav==null)
				return;
			postOrder(trav.left);
			postOrder(trav.right);
			System.out.print(trav.data);
			
		}
		public void postOrder() {
			System.out.print("postOrder: ");
			postOrder(root);
			
		}
		
		public Node binarySearch(int key) {
			Node trav=root;
			while(trav!=null) {
			if(key==trav.data)
				return trav;
			else if(key<trav.data)
				trav=trav.left;
			else
				trav=trav.right;
		}
			return null;
		}
		
		public Node[] binarySearchWithParent(int key) {
			Node trav=root;
			Node parent=null;
			
			while(trav!=null) {
				if(key==trav.data)
					break;
				parent=trav;
				
				if(key<trav.data)
					trav=trav.left;
				else
					trav=trav.right;
			}
			if(trav==null)
				parent=null;
			return new Node[] {trav,parent};
		}
		
		public void deleteAll() {
			root=null;
		}
		
		public void deleteNode(int key) {
			Node ret[]=binarySearchWithParent(key);
			Node temp=ret[0];
			Node parent=ret[1];
			
			if(temp==null)
				return;
			if(temp.left!=null&& temp.right!=null) {
				Node pred=temp.right;
				parent=temp;
				
				while(pred.left!=null) {
					parent=pred;
					pred=pred.left;
				}
				
				temp.data=pred.data;
				temp=pred;
				}
			//-------------------------------------------
			if(temp.left==null)
			{
				if(temp==root)
					root=temp.right;
				else if(temp==parent.left)
					parent.left=temp.right;
				else if(temp==parent.right)
					parent.right=temp.right;
			}
			else
			{
				if(temp==root)
					root=temp.left;
				else if(temp==parent.left)
					parent.left=temp.right;
				else if(temp==parent.right)
					parent.right=temp.right;
			}
			
		}
		 private int countLeafNodes(Node node) {
		    	Node trav=root;
		    	
		        if (node == null) {
		            return 0;
		        }
		        else {
		        trav=trav.left;
		    	trav=trav.right;
		        if (node.left == null && node.right == null)
		        
		        System.out.println(trav.data);
		        }
				return 0;

		      
		    }
		    
		    
		    public int countLeafNodes() {
		        return countLeafNodes(root);
		    }
		
		
		
		
		


}
