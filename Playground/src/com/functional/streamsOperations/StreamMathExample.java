package com.functional.streamsOperations;

import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamMathExample {

	public static void main(String[] args) {
		
		System.out.println("result all match : " + allMatch());
		System.out.println("result any match : " + anyMatch());
		System.out.println("result any match : " + noneMatch());

	}
	
	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
				.allMatch(student -> student.getGpa() >= 3.5);
	}
	
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
				.anyMatch(student -> student.getGpa() >= 4.0);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
				.noneMatch(student -> student.getGpa() >= 3);
	}

}
