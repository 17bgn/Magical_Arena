package com.kodnest.strings;
import java.util.Scanner;

public class StringToCharUsingStringBuffer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = s.nextLine();
		char c[]=st.toCharArray();
		String res = sfca(c);
		System.out.println(res);
	}
	public static String sfca(char c[]) {
		String st1= new String(c);
		String op=(st1);
		return op;
	}
}
