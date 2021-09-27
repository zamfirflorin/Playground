package com.reflection.annotations;

public class Enhancements {
	
	public static void main(String[] args) {
		
		Box<String> box = new @NonEmpty @ReadOnly Box<>(10, "box");
		box.new @ReadOnly NestedBox(11, "NestedBox");
	}

}
