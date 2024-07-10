
//WAJP to display the first half of the String in reverse order
package com.kodnest.stringsall;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Programming";
		for(int i=s.length()/2;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
