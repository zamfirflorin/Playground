package com.florin.teste;

import java.util.ArrayList;

class Solution {

	public static void main(String[] args) {
		
	}

	public String[] findWords(String[] words) {
		String[] rows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
		ArrayList<String> resultsList = new ArrayList<>();

		for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < words.length; i++) {
				if (isWordinRow(words[j], rows[i])) {
					resultsList.add(words[j]);
				}
			}
		}
		String[] itemsArray = new String[resultsList.size()];
		itemsArray = resultsList.toArray(itemsArray);
		return itemsArray;

	}

	public boolean isInRow(char c, String word) {
		boolean flag = false;
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			if (c == word.charAt(i)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean isWordinRow(String word, String row) {
		boolean flag = true;
		for (int i = 0; i < word.length(); i++) {
			if (!isInRow(word.charAt(i), row)) {
				return false;
			}
		}
		return flag;
	}

	public boolean isWordInAnyRow(String word, String[] rows) {
		boolean flag = false;
		for (int i = 0; i < rows.length; i++) {
			if (isWordinRow(word, rows[i])) {
				return true;
			}
		}
		return flag;
	}

}