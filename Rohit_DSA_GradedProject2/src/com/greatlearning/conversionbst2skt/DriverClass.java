package com.greatlearning.conversionbst2skt;

public class DriverClass {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(60);
		bst.insert(10);
		bst.insert(55);
		
		bst.inorder();
	}
	

}
