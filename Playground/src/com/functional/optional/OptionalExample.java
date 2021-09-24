package com.functional.optional;

import java.util.Optional;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class OptionalExample {

	public static void main(String[] args) {
		System.out.println(getStudentName());

		System.out.println("length of the student name = " + getStudentName().length());
		
		Optional<String> getStudentNameOptional= getStudentNameOptional();
		
		if (getStudentNameOptional.isPresent()) {
			System.out.println(getStudentNameOptional.get());
		}

	}
	
	public static String getStudentName() {
		Student student = StudentDataBase.studdentSupplier.get();
		if (student != null ) {
			 return student.getName();
		}
		return null;
	}
	
	public static Optional<String> getStudentNameOptional() {
		Optional<Student> student = Optional.ofNullable(StudentDataBase.studdentSupplier.get());
		if (student.isPresent()) {
			return student.map(Student::getName); //Optional<String>
			
		}
		return Optional.empty(); //represents an optional object with no value
	}

}
