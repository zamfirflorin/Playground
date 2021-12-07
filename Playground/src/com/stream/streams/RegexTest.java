package com.stream.streams;

public class RegexTest {

	
	public static void main(String[] args) {
		
		String word = "ceva asdihas paosdjau sa smecheresti fraerul";
		String searchTerm = "sa";
		boolean test = word
				.matches("(?i).*" + searchTerm.trim() + ".*");
		System.out.println(test);
	}
	
}
