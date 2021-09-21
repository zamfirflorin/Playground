package com.functional.terminalOperations;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.collectingAndThen;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamGroupingByExample {

	public static void main(String[] args) {
		
		//threeArgumentGroupBy();
		calculateTopGpa();
	}
	
	public static void groupStudentsByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
					.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(studentMap);
	}
	
	public static void customizedGroupingBy() {
		Map<String, List<Student>> studentMap = 
					StudentDataBase.getAllStudents()
									.stream()
									.collect(Collectors.groupingBy(
											student -> student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE"));
		
		System.out.println(studentMap);
	}
	
	public static void twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> map = 
					StudentDataBase.getAllStudents()
									.stream()
									.collect(
									Collectors.groupingBy(Student::getGradeLevel, 
											Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE")));
		System.out.println(map);
	}
	
	public static void twoLevelGrouping_2() {
		Map<String, Integer> map = 
					StudentDataBase.getAllStudents()
									.stream()
									.collect(
									Collectors.groupingBy(Student::getName, 
											Collectors.summingInt(Student::getNoteBooks)));
		System.out.println(map);
	}
	
	public static void threeArgumentGroupBy() {
		
		LinkedHashMap<String, Set<Student>> map = StudentDataBase.getAllStudents()
									.stream()
									.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, toSet()));
		System.out.println(map);
	}
	
	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.groupingBy(Student::getGradeLevel, 
											maxBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(studentMapOptional);
		
		Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, collectingAndThen(
									maxBy(Comparator.comparing(Student::getGpa)) 
									, Optional::get)));
		
		System.out.println(studentMap);
	}


}
