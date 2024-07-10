package com.kodnest.strings;

public class FrequencyOfGivenString {

	public static void main(String[] args) {
		String s = "String";
		int count=0;
		char ch='r';
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of "+ch+" is="+count);

	}

}
