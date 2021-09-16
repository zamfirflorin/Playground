package com.functional.FunctionaLinterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	

	public static void main(String[] args) {
		
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		
		c1.accept("miau");
		//printName();
		//printNameAndActivities();
		printNameAndActivitiesCondition();
	}
	
	public static void printNameAndActivities() {
		List<Student> students = StudentDataBase.getAllStudents();
		Consumer<Student> consumer = student -> System.out.println(student.getName());
		Consumer<Student> consumer2 = student -> System.out.println(student.getActivities());
		
		//consumer chaining
		students.forEach(consumer.andThen(consumer2));
		
	}
	
	public static void printNameAndActivitiesCondition() {
		List<Student> students = StudentDataBase.getAllStudents();
		Consumer<Student> consumer = student -> System.out.println(student.getName());
		Consumer<Student> consumer2 = student -> System.out.println(student.getActivities());
		
		//filtering operation
		students.forEach((student) -> {
			if (student.getGradeLevel() >= 3) {
				//sa il intreb pe calin ce face accept aici
				consumer.andThen(consumer2).accept(student);
			}
		});
		
	}
	
	public static void printName() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		List<Student> studentList2 = StudentDataBase.getAllStudents();
		Consumer<Student> c2 = (s) -> System.out.println(s);
		
		System.out.println("\n===============================\n");
		studentList.forEach(c2);
		
		System.out.println("asdad");
		studentList.forEach((s) -> System.out.println());
		System.out.println("\t========Second list====\n");
		studentList2.forEach(System.out::println);
	}

}
