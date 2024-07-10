package com.kodnest.strings;

public class CharIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder("Programming");
		System.out.println("\nFor loop");
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println("\nWhile loop");
		int i=0;
		while(i<str.length()) {
			System.out.print(str.charAt(i)+" ");
			i++;
		}
		System.out.println("\nDo loop");
		int j=0;
		do {
			System.out.print(str.charAt(j)+" ");
			j++;
		}while(j<str.length());
				
	}

}
