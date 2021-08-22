package com.florin.LinkedListImplementation;

public class SingleLinkedList {
	
	private EmployeeNode head;
	private int size;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> "); 
		while (current != null) {
			System.out.print(current + "\n\t -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		removedNode.setNext(null);
		size--;
		return removedNode;
	}
	
	
	
	
	
	
	
}
