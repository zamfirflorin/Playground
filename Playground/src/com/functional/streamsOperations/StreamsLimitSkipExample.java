package com.functional.streamsOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(6, 7, 8, 11, 9, 10);

		
		Optional<Integer> optional = limit(integerList, 5);
		
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		Optional<Integer> skipResult = skip(integerList, 5);
		if (skipResult.isPresent()) {
			System.out.println(skipResult.get());
		}

	}
	
	public static Optional<Integer> limit(List<Integer> integers, int value) {
		return integers.stream()
				.limit(value)
				.reduce((x, y) -> x + y);
	}
	public static Optional<Integer> skip(List<Integer> integers, int value) {
		return integers.stream()
				.skip(value)
				.reduce(Integer::sum);
	}

}
