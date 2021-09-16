package com.functional.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		
		Predicate<Student> studentPredicate = s -> s.getGradeLevel() >= 3.5;
		Predicate<Student> studentGpaPredicate = s -> s.getGpa() >= 2.5;
		//student name and their activities in a map 
		
		MyFunctionalInterface<Student> studentCheck = s -> s.getGpa() > 2;
		
		Consumer<Student> c1 = System.out::println;
		Consumer<Student> c2 = s -> {
			System.out.println(" After first filter " + "\n");
			System.out.println(s + "\n");
			System.out.println("after operation");
		};
		
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.peek(c1)
				.filter(studentGpaPredicate)
				.peek(c2)
				.filter(studentPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		ArrayList<Student> studentlist =  (ArrayList<Student>) StudentDataBase.getAllStudents().stream()
				.filter(studentGpaPredicate)
				.collect(Collectors.toList());
		
		System.out.println(studentMap);
//		System.out.println();
//		System.out.println(studentlist);
	}

}
