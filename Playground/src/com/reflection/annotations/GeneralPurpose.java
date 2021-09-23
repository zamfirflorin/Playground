package com.reflection.annotations;

import java.util.ArrayList;

class Parent {

	public void m1() {
		System.out.println("m1 parent class implementation");
	}
	
	@Deprecated(since = "2")
	public void m2(int a ) {
		System.out.println("m2 parent class implementation, a is " + a);
	}

}

public class GeneralPurpose extends Parent {
	
	@Override
	public void m1() {
		System.out.println("m1 child implementation");
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int a = 10;

		@SuppressWarnings({"rawtypes", "unused"})
		ArrayList arr = new ArrayList();
		System.out.println("asdads");

		GeneralPurpose obj = new GeneralPurpose();
		obj.m2(a);
		Integer i = new Integer(0);
		
		MyFunctionalInterface impl = () -> System.out.println("interface lambda imple");
		impl.method();

	}
}

@FunctionalInterface
interface MyFunctionalInterface {
	void method();
}




