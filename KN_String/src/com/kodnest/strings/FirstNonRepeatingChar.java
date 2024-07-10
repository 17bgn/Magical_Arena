
///not yet done
package com.kodnest.strings;
import java.util.Scanner;
public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String ");
		String word = s.next().trim().toLowerCase();
		int n = word.length();
		char c1[]=word.toCharArray();
		for(int i=0;i<n;i++) {
			char c = word.charAt(i);
			for(int j=0;j<n;j++) {
				if(c==c1[i]) {
					continue;
				}else {
					
				}
			}
		}
	}

}
