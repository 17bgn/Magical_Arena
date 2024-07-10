package com.kodnest.strings;
import java.util.Scanner;
public class PanagramEx {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner s = new Scanner(System.in);
		String s1 =s.nextLine();
		String mod= s1.toLowerCase();
		boolean b[]=new boolean[26];
		for(int i=0;i<mod.length();i++) {
			char c=mod.charAt(i);
			b[c-'a']=true;
		}
		int flag =0;
		for(int i=0;i<b.length;i++) {
			if(b[i]==false) {
				flag =1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The given string is a Panagram");
		}
		else {
			System.out.println("The given string is not a Panagram");
		}

	}

}
