package com.functional.numericStreams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class NumericStreamsRangesExample {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.range(1,  50);
		System.out.println("Range count " + intStream.count());
		IntStream.range(1,  50).forEach(value -> System.out.print(value + " "));
		System.out.println("\n");
		System.out.println("Range closed count " + IntStream.rangeClosed(1,  50).count());
		IntStream.rangeClosed(1,  50).forEach(value -> System.out.print(value + " "));
		
		System.out.println("\n");
		System.out.println("Long Range closed count " + LongStream.rangeClosed(1,  50).count());
		LongStream.rangeClosed(1,  50).forEach(value -> System.out.print(value + " "));
		
	}
	
	public static int sumOfNNumbers(List<Integer> integerList) {
		
		return integerList.stream()
						  .reduce(0, (x, y) -> x + y); //unboxing to convert Integer to int, this is a wasting operation
		//Int stream comes into place
	}
	
	public static int sumOfNNumbersIntStream(List<Integer> integerList) {
		return IntStream.range(1, 6)
				.sum();
	}

}
