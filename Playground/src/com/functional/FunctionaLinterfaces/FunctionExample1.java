package com.functional.FunctionaLinterfaces;

public class FunctionExample1 {

	public static void main(String[] args) {
		
		String result = performConcat("hello");
		System.out.println("Result " + result);

	}
	
	public static String performConcat(String str) {

		return FunctionExample.addSomeString.apply(str);
	}

}
