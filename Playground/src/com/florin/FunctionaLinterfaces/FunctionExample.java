package com.florin.FunctionaLinterfaces;

import java.util.function.Function;

public class FunctionExample {

	
	static Function<String, String> function = name -> name.toUpperCase();
	static Function<String, String> addSomeString = s -> s.concat(" anotherString");
	
	public static void main(String[] args) {
		
		System.out.println("Result is : " + function.apply("florin") + "\n");
		System.out.println("Result of AND THEN : " + function.andThen(addSomeString).andThen(addSomeString).apply("florin"));
		System.out.println("Result of compose : " + function.compose(addSomeString).apply("florin"));
		
	}
	
	
	
	
}
