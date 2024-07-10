//convert mutable to Immmutable;
package com.kodnest.stringsall;

public class Solution9 {
	public static void main(String[] args) {
		StringBuilder s =new StringBuilder("Hello");
		String s1= new String(s);
		System.out.println(s1);
	}
}
