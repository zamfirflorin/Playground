package com.functional.streamsOperations;

import com.functional.FunctionaLinterfaces.Student;
import com.functional.FunctionaLinterfaces.StudentDataBase;

public class StreamMapReduceExample {

	public static void main(String[] args) {
			
		int totalNbOfNotebooks = nbOfNotebooks();
		System.out.println(totalNbOfNotebooks);
		
		
		int notebooks = totalNbofNotebboks();
		System.out.println(notebooks);
		
		System.out.println(nbOfNotebooksAlternative());

	}
	
	
	//what is the number of notebooks that the collection has
	
	private static int nbOfNotebooks() {
		
		return StudentDataBase.getAllStudents()
				.stream() //Stream<Student>
				.map(student -> student.getNoteBooks()) //Stream<Integer>
				.reduce(0, (a, b) -> a + b);
	}
	
	
	//what is the number of notebooks that the collection has
	
	private static int nbOfNotebooksAlternative() {
		
		return StudentDataBase.getAllStudents()
				.stream() //Stream<Student>
				.filter(s -> s.getGradeLevel() > 3)
				.filter(s -> s.getGender().equals("female"))
				.map(student -> student.getNoteBooks()) //Stream<Integer>
				.reduce(0, Integer::sum);
	}
	
	
	public static int totalNbofNotebboks() {
		int sum = 0; 
		for (Student s: StudentDataBase.getAllStudents()) {
			sum += s.getNoteBooks();
		}
		return sum;
	}

}
