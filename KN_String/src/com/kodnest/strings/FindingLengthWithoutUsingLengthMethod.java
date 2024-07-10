package com.kodnest.strings;

public class FindingLengthWithoutUsingLengthMethod {
	public static void main(String[] args) {
		String s = "Guru Nagendra";
		int i=0;
		int count=0;
		try {
		while(true) {
			System.out.println(s.charAt(i));
			i++;
			count++;
		}
		}catch(Exception e) {
			
		}
		System.out.println("The Length of the String = "+count);
	}
}
