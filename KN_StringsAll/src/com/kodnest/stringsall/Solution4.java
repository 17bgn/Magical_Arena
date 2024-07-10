
//WAJP to display the last half of the String
package com.kodnest.stringsall;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Programming";
		for(int i=(s.length()/2)+1;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}

	}

}
