package com.stream.streams;

public class test {

	public static void main(String[] args) {
		System.out.println(solver(0));
		System.out.println(solver(1));
		System.out.println(solver(2));
		System.out.println(solver(3));
		System.out.println(solver(4));
		System.out.println(solver(5));
	}

	static int solver(int input) {

		if (input == 0) {
			return 1;
		}
		int result = 1;
		for (int i = 1; i <= input; i++) {
			result *= i;
		}
		return result;
	}

}
