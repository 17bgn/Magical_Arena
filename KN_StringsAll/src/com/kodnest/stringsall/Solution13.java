//Reverse the order of the sentence

package com.kodnest.stringsall;

public class Solution13 {
	public static void main(String[] args) {
		String s ="hello java program";
		String s2[]=s.split(" ");
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}
	}
}
