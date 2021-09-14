package com.florin.FunctionaLinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

//if input and output type are the same then we can use the unary and binary operator instead of function

public class BinaryOperatorExample {

	public static void main(String[] args) {

		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
		System.out.println(binaryOperator.apply(3, 4));
		
		System.out.println();

		Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

		System.out.println("Result of maxBy is : " + maxBy.apply(4, 3));
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		
		System.out.println("Result of minBy is : " + minBy.apply(4, 3));

	}

}
