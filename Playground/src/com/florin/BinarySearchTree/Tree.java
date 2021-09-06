package com.florin.BinarySearchTree;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	
	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		} 
		return root.min();
	}
	
	public int max() {
		if (root == null) {
			return Integer.MAX_VALUE;
		} 
		return root.max();
	} 
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		if (root != null) {
			return root.get(value);
		}
		return null;
	}
}
