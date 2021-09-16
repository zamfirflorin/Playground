package com.florin.MethodReference;

import java.util.function.Predicate;

import com.florin.FunctionaLinterfaces.Student;
import com.florin.FunctionaLinterfaces.StudentDataBase;

public class RefactorMethodReference {
	
	static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = RefactorMethodReference::greaterThanGradeLevel;

	public static void main(String[] args) {
		
		
		
		System.out.println(p1.test(StudentDataBase.studdentSupplier.get()));
		System.out.println(p2.test(StudentDataBase.studdentSupplier.get()));

	}
	
	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel() >= 3;
	}

}
