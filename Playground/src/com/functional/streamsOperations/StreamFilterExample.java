package com.functional.streamsOperations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;
import static java.util.stream.Collectors.toList;

public class StreamFilterExample {

	public static void main(String[] args) {

		filterStudents().forEach(System.out::println);
		System.out.println();
		filterStudentsFemale().forEach(System.out::println);
	}

	public static List<Student> filterStudents() {

		return StudentDataBase.getAllStudents()
				.stream()
				.filter(s -> s.getGradeLevel() > 2)
				.sorted(Comparator.comparing(Student::getName)).sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());

	}

	public static List<Student> filterStudentsFemale() {

		return StudentDataBase.getAllStudents()
				.stream()
				.filter(s -> s.getGender()
				.equals("female"))
				.collect(toList());
	}

}
