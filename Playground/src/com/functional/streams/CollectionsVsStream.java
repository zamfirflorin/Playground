package com.functional.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStream {
	
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		names.add("florin");
		names.add("test");
		
		names.forEach(System.out::println);
		System.out.println("============");
		names.forEach(System.out::println);

		System.out.println("\n======\tStream\t=====");
		
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		
		System.out.println("\nSecond stream values :  ");
		nameStream.forEach(System.out::println);
		
		
		
	}
}
