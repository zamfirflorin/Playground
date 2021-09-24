package com.functional.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	public static final String myString = "hello";
	
	public static void main(String[] args) {
		
		System.out.println(ofNullable());
		System.out.println(of());
		System.out.println(empty());

	}
	
	public static Optional<String> ofNullable() {
		
		Optional<String> stringOptional = Optional.ofNullable(null);
		return stringOptional;
	}
	
	
	public static Optional<String> of() {
		
		Optional<String> stringOptional = Optional.of(myString);
		return stringOptional;
	}
	
	public static Optional<String> empty() {
		
	
		return Optional.empty();
	}
	
	
	
}
