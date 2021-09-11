package com.florin.FunctionaLinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println(a + " " + b);
		};
		
		biConsumer.accept("a", "b");
		biConsumer.accept("another test", "another b test");
		
		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("Multiplication : " + (a*b));
		};
		BiConsumer<Integer, Integer> division = (a, b) -> {
			System.out.println("division : " + (a/b));
		};
		multiply.andThen(division).accept(10, 5);
		nameAndActivities();
	}
	
	public static void nameAndActivities() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
			System.out.println(name + " : " + activities);
		};
		studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
	}

}
