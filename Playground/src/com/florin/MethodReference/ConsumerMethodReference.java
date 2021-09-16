package com.florin.MethodReference;

import java.util.Arrays;
import java.util.function.Consumer;

import com.florin.FunctionaLinterfaces.Student;
import com.florin.FunctionaLinterfaces.StudentDataBase;

public class ConsumerMethodReference {

	public static void main(String[] args) {
		
		//varianta expresie lambda
		Consumer<Student> c1 = p -> System.out.println(p);
		
		StudentDataBase.getAllStudents().forEach(c1);

		
		//varianta method reference
		Consumer<Student> c2 = System.out::println;
		StudentDataBase.getAllStudents().forEach(c2);
		
		//varianta method reference care apeleaza noua metoda din Student printActivities() 
		//instance method name
		
		System.out.println();
		Consumer<Student> c3 = Student::printListOfActivities;
		StudentDataBase.getAllStudents().forEach(c3);
	}

}
