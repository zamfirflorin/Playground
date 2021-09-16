package com.functional.streamsOperations;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamMapExample {

	public static void main(String[] args) {
		
		System.out.println(namesList());
		System.out.println(namesSet());
		
	}
	
	static List<String> namesList() {
		return StudentDataBase.getAllStudents().stream() //Stream of student
				.map(Student::getName) //output Stream<String>
				.map(String::toUpperCase) //output Stream<String> -> uppercase operation on each input
				.collect(toList()); //final operation
	}
	
	static Set<String> namesSet() {
		return StudentDataBase.getAllStudents().stream() //Stream of student
				.map(Student::getName) //output Stream<String>
				.map(String::toUpperCase) //output Stream<String> -> uppercase operation on each input
				.collect(toSet()); //final operation
	}

}
