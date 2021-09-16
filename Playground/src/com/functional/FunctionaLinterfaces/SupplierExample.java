package com.functional.FunctionaLinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
	
		Supplier<Student> StudentSupplier = () -> {
			return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
		};
		
		System.out.println(StudentSupplier.get());
		
		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
		
		System.out.println("Students are : " + listSupplier.get());

	}

}
