package com.kodnest.stringsall;

public class Solution14 {
	public static void main(String[] args) {
		String s ="hello java program";

		String s2[]=s.split(" ");

		for(int i=0;i<s2.length;i++) {
			System.out.print(new StringBuffer(s2[i]).reverse()+" ");
			/*or StringBuffer str=new StringBuffer(a[i]);
			 * System.out.print(str.reverse());
			 */
		}
	}
	
}

