package com.kodnest.strings;

public class WithoutReverseMethod {
	public static void main(String[] args) {
		String s ="MOM";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String = "+rev);
		if(s.equals(rev)) {
			System.out.println("Polindrome");
		}else {
			System.out.println("Not Polindrome");
		}
	}
}
