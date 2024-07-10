package com.kodnest.strings;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello";
		StringBuilder st = new StringBuilder(s);
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
