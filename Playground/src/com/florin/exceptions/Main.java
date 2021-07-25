package com.florin.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 98;
		int y = 0;
		Utils utils = new Utils();
		int n = utils.getIntLBYL();
//		System.out.println(divideLBYL(x, y));
//		System.out.println(divideEAFP(x, y));
//		System.out.println(divide(x, y));
		System.out.println("n = " + n);
		
	}

	public static int divideLBYL(int x, int y) {
		if (y != 0) {
			return x / y;
		} else {
			return 0;
		}
	}
	
	public static int divideEAFP(int x, int y) {
		try {
			return x / y;
		} catch (ArithmeticException e) {
			return 0;
		}
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	
	public static int getIntLBYL() {
		Scanner sc = new Scanner(System.in);
		boolean isValid = true;
		System.out.println("Please enter an integer: ");
		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				isValid = false;
				break;
			}
		}
		
		if (isValid) {
			return Integer.parseInt(input);
		}
		return 0;
	}
	
	public static int getIntEAFP() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		try {
			return sc.nextInt();
		} catch (InputMismatchException e) {
			return 0;
		}
	}

}
