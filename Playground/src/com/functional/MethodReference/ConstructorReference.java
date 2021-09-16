package com.functional.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import com.functional.FunctionaLinterfaces.Student;

public class ConstructorReference {

	public static void main(String[] args) {
		
		//Example - the Student class must have an empty constructor defined - //rezultatul expresiei trebuie sa fie o interfata functionala
		Supplier<Student> studentSupplier = Student::new;
		
		//In cazult asta Student trebuie sa defineasca un constructor cu un parametru de tip String
		Function<String, Student> studentFunction = Student::new;
		BiFunction<String, Integer, Student> studentBiFunction = Student::new;
		
		//Invalid
		//Student student = Student::new;
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("Florin"));
		System.out.println(studentBiFunction.apply("Florin", 4));
	}
	
	

}
