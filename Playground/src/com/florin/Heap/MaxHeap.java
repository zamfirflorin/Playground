package com.florin.Heap;

public class MaxHeap {
	
	private int[] heap;
	private int size;
	
	public MaxHeap(int capacity) {
		heap = new int[capacity];
	}
	
	public boolean isFull() {
		return size == heap.length;
	}
	
	public int getParent(int index) {
		return (index - 1) / 2;
	}
	
	public void insert(int value) {
		if(isFull()) {
			throw new IndexOutOfBoundsException("The heap is full");
		}
		heap[size++] = value;
		fixHeapAbove(size);
		size++;
	}
	
	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		while (index > 0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		heap[index] = newValue;
	}
	
}
