package com.functional.streamsOperations;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamFlatMapExamples {

	public static void main(String[] args) {
		
		System.out.println(printStudentActivities());
		System.out.println(printStudentActivitiesCount());
		
	}
	
	public static List<String> printStudentActivities() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //create a Stream<String>
				.distinct()
				.map(String::toUpperCase)
				.sorted()
				.collect(toList());
	}
	
	public static long printStudentActivitiesCount() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //create a Stream<String>
				.distinct()
				.count();
	}


}
