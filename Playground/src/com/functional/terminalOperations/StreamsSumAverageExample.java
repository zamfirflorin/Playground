package com.functional.terminalOperations;

import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.averagingInt;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamsSumAverageExample {

	public static void main(String[] args) {
		
		System.out.println("Total No of notebooks : " + sum());
		System.out.println("Average No of notebooks : " + averagingInt_example());

	}
	
	public static int sum() {
		return StudentDataBase.getAllStudents().stream()
					.collect(summingInt(Student::getNoteBooks));
	}
	
	public static double averagingInt_example() {
		return StudentDataBase.getAllStudents().stream()
				.collect(averagingInt(Student::getNoteBooks));
	}

}
