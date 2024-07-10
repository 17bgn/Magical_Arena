
//convert Immmutable  to mutable ;
package com.kodnest.stringsall;

public class Solution10 {
	public static void main(String[] args) {
		String s1= "hello";
		StringBuilder s = new StringBuilder(s1);
		System.out.println(s);
	}
}