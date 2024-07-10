package com.kodnest.stringsall;

public class Solution18HW {
	public static void main(String[] args) {
		String s="Program";
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				System.out.print(s.charAt(i));
			}
		}
		
		for(int i=s.length()-1;i>=0;i--) {
			if(i%2==0) {
				System.out.print(s.charAt(i));
			}
		}
	}
}
