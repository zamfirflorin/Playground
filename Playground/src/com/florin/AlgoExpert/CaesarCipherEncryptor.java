package com.florin.AlgoExpert;

public class CaesarCipherEncryptor {

	public static void main(String[] args) {
		char c = 'k' + 2 -  ('a' - 'k');
		int key = 2;
		int cminusa = (int) (c - 'a');

		System.out.println(c + " " + key + " " + cminusa);
		String str = "xyz";
		String res = caesarCypherEncryptor(str, 2);
		System.out.println(res);

	}

	public static String caesarCypherEncryptor(String str, int key) {
		char[] res = new char[str.length()];
		 key = key % 26;
		for (int i = 0; i < str.length(); i++) {
			char ch =  str.charAt(i);
			res[i] = ch + key <= 122 ? (char) (ch + key) : (char) (96 + (ch + key) % 122); 
		}

		return new String(res);
	}

}
