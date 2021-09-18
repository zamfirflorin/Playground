package com.functional.streamsOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamReduceExample {

//	Reduce is a terminal operation used to reduce the contents of a stream to a single value
//	It takes two parameteres as an input
//		- first parameters - default or initial value
//		- second parameter - BinaryOperator<T>
	
	
	public static void main(String[] args) {
		
		
		List<Integer> integers = Arrays.asList(1, 3, 5, 7);
		List<Integer> secondList = Arrays.asList();
		int res = performMultiplication(integers);
		System.out.println(res);

		Optional<Integer> secondOperation = performMultiplicationWithoutIdentity(integers);
		System.out.println(secondOperation.isPresent());
		System.out.println(secondOperation.get());
		
		
		System.out.println("Test");
		
		Optional<Integer> res1 = performMultiplicationWithoutIdentity(secondList);
		if (res1.isPresent()) {
			System.out.println(res1.get());
		}
		
		
		System.out.println(getHighestGPAStudent().get());
		
	}

	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
		//1
		//3
		//5
		//7
		.reduce(1, (a, b) -> a * b);
		//a = 1, b = 1 (from stream) => result 1 is returned
		//a = result from previous step 1, b = 3 from stream => result 3 is returned
		// a = 3, b from stream 5 => result 15
		// a = 15, b = 7 = result = 105

	}


	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream()
		//1
		//3
		//5
		//7
		.reduce((a, b) -> a * b);
		//a = 1, b = 1 (from stream) => result 1 is returned
		//a = result from previous step 1, b = 3 from stream => result 3 is returned
		// a = 3, b from stream 5 => result 15
		// a = 15, b = 7 = result = 105
		
	}
	
	public static Optional<Student> getHighestGPAStudent() {
		return StudentDataBase.getAllStudents()
				.stream()
				.reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));
	}
	

}
