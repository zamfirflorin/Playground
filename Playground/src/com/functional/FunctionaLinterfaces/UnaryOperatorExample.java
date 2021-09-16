package com.functional.FunctionaLinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		

		System.out.println(unaryExample.apply("Java 8"));
		
	}
	
	static UnaryOperator<String> unaryExample = s -> s.concat(" default");

}
