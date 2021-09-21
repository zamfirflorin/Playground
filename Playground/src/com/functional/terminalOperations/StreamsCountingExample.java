package com.functional.terminalOperations;

import com.functional.FunctionaLinterfaces.StudentDataBase;
import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

	public static void main(String[] args) {
		System.out.println(count());
	}
	
	public static long count() {
		return StudentDataBase.getAllStudents().stream()
						.filter(student -> student.getGpa() > 3.9)
						.collect(counting());
	}

}
