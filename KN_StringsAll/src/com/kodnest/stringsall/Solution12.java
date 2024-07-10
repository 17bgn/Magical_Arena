
//WAJP to find a String is Polindrome or not
package com.kodnest.stringsall;

public class Solution12 {
	public static void main(String[] args) {
		String s="hello";
		StringBuilder s1=new StringBuilder(s);
		StringBuilder rev=s1.reverse();
		String s2=rev.toString();
		if(s.equals(s2)) {
			System.out.println("String is Polindrome");
		}else {
			System.out.println("String is NOT Polindrome");
		}
	}
}
