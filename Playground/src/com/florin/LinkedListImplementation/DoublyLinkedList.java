package com.florin.LinkedListImplementation;

public class DoublyLinkedList {
	public Node head;
	public Node tail;

	public void setHead(Node node) {
		if (head == null) {
			head = node;
			tail = node;
		}
		insertBefore(head, node);
	}

	public void setTail(Node node) {
		if (tail == null) {
			setHead(node);
			return;
		}
		insertAfter(tail, node);
	}

	// O(1) TS
	public void insertBefore(Node node, Node nodeToInsert) {
		if (nodeToInsert == head && nodeToInsert == tail) {
			return;
		}
		remove(nodeToInsert);
		nodeToInsert.prev = node.prev;
		nodeToInsert.next = node;
		if (node.prev == null) {
			head = nodeToInsert;
		} else {
			node.prev.next = nodeToInsert;
		}
		node.prev = nodeToInsert;

	}

	public void insertAfter(Node node, Node nodeToInsert) {
		if (nodeToInsert == head && nodeToInsert == tail) {
			return;
		}
		remove(nodeToInsert);
		nodeToInsert.prev = node;
		nodeToInsert.next = node.next;
		if (node.next == null) {
			tail = nodeToInsert;
		} else {
			node.next.prev = nodeToInsert;
		}
		node.next = nodeToInsert;
	}

	public void insertAtPosition(int position, Node nodeToInsert) {
		if (position == 0) {
			setHead(nodeToInsert);
			return;
		}
		Node current = head;
		int index = 0;
		while (current != null && index++ != position) {
			current = current.next;
		}
		if (current != null) {
			insertBefore(current, nodeToInsert);
		} else {
			setTail(nodeToInsert);
		}
	}

	public void removeNodesWithValue(int value) {
		Node node = head;
		while (node != null) {
			Node nodeToRemove = node;
			node = node.next;
			if (nodeToRemove.value == value) {
				remove(nodeToRemove);
			}
		}
	}

	public void remove(Node node) {
		if (node == this.head) {
			this.head = node.next;
		}
		if (node == this.tail) {
			this.tail = node.prev;
		}
		removeNodeBindings(node);
	}

	public boolean containsNodeWithValue(int value) {
		Node node = this.head;
		while (node != null && node.value != value) {
			node = node.next;
		}
		return node != null;
	}

	private static void removeNodeBindings(Node node) {
		if (node.prev != null) {
			node.prev.next = node.next;
		}
		if (node.next != null) {
			node.next.prev = node.prev;
		}
		node.prev = null;
		node.next = null;
	}
}

class Node {
	public int value;
	public Node prev;
	public Node next;

	public Node(int value) {
		this.value = value;
	}
}
