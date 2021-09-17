package com.functional.streamsOperations;

import java.util.Optional;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamFindAnyFirstExample {

	public static void main(String[] args) {
	

		Optional<Student> studentOptionalFindAny = findAnyStudent();
		
		if (studentOptionalFindAny.isPresent()) {
			System.out.println("Found the student : " + studentOptionalFindAny.get());
		}
		
		Optional<Student> studentOptionalfindFirstStudent = findFirstStudent();
		
		if (studentOptionalfindFirstStudent.isPresent()) {
			System.out.println("Found the student : " + studentOptionalfindFirstStudent.get());
		}
		
	}
	
	public static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents().stream()
				//as soon a student in the stream meets the criteria it returns
				.filter(student -> student.getGpa() >= 3)
				.findAny();
	}
	
	public static Optional<Student> findFirstStudent() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3)
				.findFirst();
	}
	
	
	
	

}
