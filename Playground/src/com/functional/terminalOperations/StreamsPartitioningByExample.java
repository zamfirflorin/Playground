package com.functional.terminalOperations;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamsPartitioningByExample {

	public static void main(String[] args) {
		
		//partitioningBy_1();
		partitioningBy_2();
	}
	
	public static void partitioningBy_1() {

		Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.8;
		Map<Boolean, List<Student>> partitoiningMap = StudentDataBase.getAllStudents().stream()
						.collect(partitioningBy(gpaPredicate));
		System.out.println("partitioningMap : " + partitoiningMap);
	}
	
	public static void partitioningBy_2() {

		Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.8;
		Map<Boolean, Set<Student>> partitoiningMap = StudentDataBase.getAllStudents().stream()
													.collect(partitioningBy(gpaPredicate, toSet()));

		System.out.println("partitioningSet : " + partitoiningMap);
	}

}
