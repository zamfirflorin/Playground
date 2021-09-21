package com.functional.terminalOperations;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {
		
		List<String> studentList = StudentDataBase.getAllStudents()
						.stream()
						.collect(mapping(Student::getName, toList()));
		System.out.println(studentList);

		
		Set<String> studentSet = StudentDataBase.getAllStudents()
				.stream()
				.collect(mapping(Student::getName, toSet()));
		System.out.println(studentSet);
		
	}

}
