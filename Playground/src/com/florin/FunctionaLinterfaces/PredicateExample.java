package com.florin.FunctionaLinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p = a -> {return a % 2 == 0;};
	static Predicate<Integer> divisibleByTwo = a ->  a % 2 == 0;
	static Predicate<Integer> dibByFive = a -> a % 5 == 0;
	
	public static void main(String[] args) {

		System.out.println(p.test(9));
		System.out.println(divisibleByTwo.test(8));
		
		predicateAnd();
		predicateOr();
		negate();
	}
	
	public static void predicateAnd() {
		System.out.println("Predicate AND result : " + divisibleByTwo.and(dibByFive).test(12));
	}
	public static void predicateOr() {
		System.out.println("Predicate OR result : " + divisibleByTwo.or(dibByFive).test(12));
	}
	
	public static void negate() {
		System.out.println("Predicate NEGATE result : " + divisibleByTwo.or(dibByFive).negate().test(12));
	}

}
