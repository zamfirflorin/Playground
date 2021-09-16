package com.florin.BinarySearch;

	public class CountOccurrences {
		 
		
		// O (n)
		  public static int countOccurrences(int[] arr, int value) {
				int start = 0; 
				int end = arr.length;
				int counter = 0; 
				
				while (start < end) {
					int midpoint = (start + end) / 2;
					int left = midpoint;
					int right = midpoint;
					if (value == arr[midpoint]) {
						counter++;
						right++;
						left--;
						while (arr[right] == value) {
							counter++;
							right++;
						}
						while (arr[left] == value) {
							left--;
							counter++;
						}
						break;
					} 

					else if (value < arr[midpoint]) {
						end = midpoint;
					} else {
						start = midpoint + 1;
					}
				}
				return counter;
		  }
		 
		  public static void main(String[] args) {
		    System.out.println("Checking input...");
		 
		    int[] array = {0, 2, 3, 5, 5, 5, 8, 11, 11, 101};
		 
		    int rez = countOccurrences(array, 8);
		    System.out.println("You got: " + rez + " Correct: " + 2);
		  }
	}


