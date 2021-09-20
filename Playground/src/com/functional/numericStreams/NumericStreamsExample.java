package com.functional.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(sumOfNNumbers(integerList));
		System.out.println(sumOfNNumbersIntStream(integerList));

	}
	
	public static int sumOfNNumbers(List<Integer> integerList) {
		
		return integerList.stream()
						  .reduce(0, (x, y) -> x + y); //unboxing to convert Integer to int, this is a wasting operation
		//Int stream comes into place
	}
	
	public static int sumOfNNumbersIntStream(List<Integer> integerList) {
		return IntStream.rangeClosed(1, 6)
				.sum();
	}

}
