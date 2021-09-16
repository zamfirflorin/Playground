package com.functional.streamsOperations;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList; 

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamComparatorExample {

	public static void main(String[] args) {
		
		System.out.println("Students sorted by name");
		sortedStudentByName().forEach(System.out::println);
	}
	
	public static List<Student> sortedStudentByName() {
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(toList());
	}
	
	public static List<Student> sortedStudentByGpa() {
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(toList());
	}
	public static List<Student> sortedStudentByGpaDescending() {
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(toList());
	}
	  
	public static List<String> sortedStudentByNameAndGetOnlyName() {
		return StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.sorted()
				.collect(toList());
	}

}
