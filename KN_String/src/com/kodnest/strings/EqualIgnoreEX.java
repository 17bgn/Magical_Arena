package com.kodnest.strings;

public class EqualIgnoreEX {

	public static void main(String[] args) {
		String s1= new String("JAva");
		String s2= new String("java");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}

}
