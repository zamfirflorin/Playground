package com.florin.HashTableImplementation;

public class MainHashTable {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 123);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 123);
		Employee billEnd = new Employee("Bill", "End", 123);
		
		SimpleHashTable ht = new SimpleHashTable();
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marySmith);
		
		ht.printHashTable();
		
		System.out.println(ht.get("Wilson"));
	}

}
