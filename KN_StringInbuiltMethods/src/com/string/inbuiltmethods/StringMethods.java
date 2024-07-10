package com.string.inbuiltmethods;

public class StringMethods {
	public static void main(String[] args) {
		//Immutable classes & methods
		String s = new String("Java Program");
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(0,4));
		System.out.println(s.replace('a','G'));
		System.out.println(s.startsWith("J"));
		System.out.println(s.endsWith("ram"));
		System.out.println(s.contains("java"));
		String split[]=s.split("a");
		for(int i=0;i<split.length;i++) {
		System.out.print(split[i]);
		}
		System.out.println();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+" ");}
		System.out.println();
		String s2="KodNest";
		
		//Mutable classes & methods
		StringBuilder sb =new StringBuilder("Hanuman");
		System.out.println(sb.append("Jai"));
		
	}
}
