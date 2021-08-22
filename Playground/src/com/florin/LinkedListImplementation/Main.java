package com.florin.LinkedListImplementation;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 123);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 123);
		Employee billEnd = new Employee("Bill", "End", 123);
		
		SingleLinkedList list = new SingleLinkedList();
		System.out.println(list.isEmpty());
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		list.printList();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.removeFromFront();
		list.printList();
	}

}
