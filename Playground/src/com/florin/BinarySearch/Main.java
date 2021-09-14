package com.florin.BinarySearch;

public class Main {

	public static void main(String[] args) {
		
		int[] intArr = new int[] {-22, -15, 1, 7, 20, 35, 55, 66, 19};
		
		System.out.println(iterativeBinarySearch(intArr, 20));
		System.out.println(iterativeBinarySearch(intArr, 1));
		System.out.println();
		System.out.println(recursiveBinarySearch(intArr, 20));
		System.out.println(recursiveBinarySearch(intArr, 1));

	}
	
	//O (log(n)) time
	public static int iterativeBinarySearch(int[] arr, int value) {
		int start = 0; 
		int end = arr.length;
		
		while (start < end) {
			int midpoint = (start + end) / 2;
			if (value == arr[midpoint]) {
				return midpoint;
			} else if (value < arr[midpoint]) {
				end = midpoint;
			} else {
				start = midpoint + 1;
			}
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] arr, int value) {
		return recursiveBinarySearch(arr, 0, arr.length, value);
	}

	
	//overhead involved with method calls
	private static int recursiveBinarySearch(int[] arr, int start, int end, int value) {
		if (start >= end) {
			return -1;
		}
		int midpoint = (start + end) / 2;
		if (arr[midpoint] == value) {
			return midpoint;
		} else if (arr[midpoint] < value) {
			return recursiveBinarySearch(arr, midpoint + 1, end, value);
		} else {
			return recursiveBinarySearch(arr, start, midpoint, value);
		}
	}

}
