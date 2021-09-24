package com.functional.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	
	public static void main(String[] args) {
		
		System.out.println(ofNullable().get());

	}
	
	public static Optional<String> ofNullable() {
		
		Optional<String> stringOptional = Optional.ofNullable("Hello");
		return stringOptional;
	}
	
}
