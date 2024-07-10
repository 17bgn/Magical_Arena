//solution 13 14 15 are related
package com.kodnest.stringsall;

public class Solution15 {
	public static void main(String[] args) {
		String s ="hello java program";

		String s2[]=s.split(" ");

		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(new StringBuffer(s2[i]).reverse()+" ");
			/*or StringBuffer str=new StringBuffer(a[i]);
			 * System.out.print(str.reverse());
			 */
		}
	}

}
