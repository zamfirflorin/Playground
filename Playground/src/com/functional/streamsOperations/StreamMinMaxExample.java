package com.functional.streamsOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(6, 7, 8, 11, 9, 10);
		System.out.println(findMaxValue(integerList));

		Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
		if (maxValueOptional.isPresent()) {
			System.out.println(maxValueOptional.get());
		}
		System.out.println("min value is : " + findMinValue(integerList).get());
	}
	
	//calculate max element in the list
	public static int findMaxValue(List<Integer> integerList) {
		return  integerList.stream() 
				//6 -> y
				//7 -> y
				//8 -> y
				//9 -> y
				//10 -> y
				//la inceput x e 0 apoi maximul dintre x si y
				.reduce(0, (x, y) -> x > y ? x : y); //x variable holds the max value for each element in the iteration
	}
	
	public static Optional<Integer> findMinValue(List<Integer> integerList) {
		return  integerList.stream() 
				.reduce(Integer::min);
	}

	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		return  integerList.stream()
				//6 -> y
				//7 -> y
				//8 -> y
				//9 -> y
				//10 -> y
				//la inceput x e 0 apoi maximul dintre x si y
				.reduce((x, y) -> x > y ? x : y); //x variable holds the max value for each element in the iteration
	}
	

}
