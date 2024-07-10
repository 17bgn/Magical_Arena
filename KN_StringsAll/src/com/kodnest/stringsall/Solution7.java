//WAJP to convert to a string to an Array & Display array elements
package com.kodnest.stringsall;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Programming";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		System.out.println(c);
	}
}