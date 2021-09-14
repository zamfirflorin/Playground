package com.florin.MethodReference;

import java.util.function.Function;

public class FunctionMethodReference {

	public static void main(String[] args) {
		
		
		//varianta expresie lambda
		Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();
		System.out.println(toUpperCaseLambda.apply("florin"));

		
		//varianta method reference
		Function<String, String> toUpperCaseMethodReference = String::toUpperCase;
		System.out.println(toUpperCaseMethodReference.apply("florin"));
		
		
		
	}

}
