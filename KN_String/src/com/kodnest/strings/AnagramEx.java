package com.kodnest.strings;

import java.util.Arrays;

public class AnagramEx {

	public static void main(String[] args) {
		String s1="Listen";
		String s2 = "Silent";

		String ls1=s1.toLowerCase();
		String ls2=s2.toLowerCase();


		char c1[]=ls1.toCharArray();
		char c2[]=ls2.toCharArray();
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(c1.length != c2.length) {
			System.out.println("Length is !=. So => Not Anagram");
			return;
		}
		
		if(Arrays.equals(c1,c2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}	
		
}
}
/*char Array sorting 
		for(int i=0;i<c1.length;i++) {
			for(int j=i+1;j<c1.length;j++) {
				if((c1[i])>(c1[j])) {
					char temp = c1[i];
					c1[i]=c1[j];
					c1[j]=temp;
				}
			}
		}
*/
