package com.florin.sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bubbleSortArr = {4, 5, 2, 1, 0, -3, 8};
		int[] selectionSortArr = {4, 5, 2, 1, 0, -3, 8};
		bubbleSort(bubbleSortArr);
		for(int i : bubbleSortArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		bubbleSort(selectionSortArr);
		for(int i : selectionSortArr) {
			System.out.print(i + " ");
		}


	}
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, arr[j], arr[j+1]);
				}
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int arr[]) {
		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (arr[i] > arr[largest]) {
					largest = i;
				}
			}
			swap(arr, largest, lastUnsortedIndex);
		}
		return arr;
		
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = i;
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
