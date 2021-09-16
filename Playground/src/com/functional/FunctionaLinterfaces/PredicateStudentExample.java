package com.functional.FunctionaLinterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

	static Predicate<Student> gradeBiggerThanTwo = student ->  student.getGradeLevel() > 2;
	static Predicate<Student> gpaGreater3 = student ->  student.getGpa() >= 3.5;
	
	public static void main(String[] args) {
		filterStudentByGradeLevel();
		System.out.println();
		filterStudentByGpa();
	}
	
	public static void  filterStudentByGradeLevel() {
		List<Student> students = StudentDataBase.getAllStudents();
		
		students.forEach(student -> {
			if (gradeBiggerThanTwo.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void  filterStudentByGpa() {
		List<Student> students = StudentDataBase.getAllStudents();
		
		students.forEach(student -> {
			if (gpaGreater3.and(gradeBiggerThanTwo).negate().test(student)) {
				System.out.println(student);
			}
		});
	}
	
	

}
