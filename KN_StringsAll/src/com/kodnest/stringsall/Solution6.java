
//WAJP to display the last half of the String in reverse order
package com.kodnest.stringsall;

public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Programming";
		for(int i=s.length()-1;i>(s.length()/2);i--) {
			System.out.print(s.charAt(i));
		}
	}
}
