package com.kodnest.strings;
import java.util.Scanner;
public class FormattedSentence {
	public static String formatSentence(String input) {
		String op="";
		String split[]=input.split(" ");
		for(int i=0;i<split.length;i++) {
			char c = split[i].charAt(0);
			if(c>=97 && c<=122) {
				c=(char)(c-32);
				String sub=split[i].substring(1);
				op=op+c+sub+" ";
			
			}else if(c>=65 && c<=90) {
				c=(char)(c+32);
				String sub=split[i].substring(1);
				op=op+c+sub+" "; }
			else {
				op=op+" ";
			}
		}
		op=op.trim();
		if(op.endsWith(".")) {
			op=op.substring(0,op.length()-1);
		}
		return op;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s1 = s.nextLine();
		String format=formatSentence(s1);
		System.out.println("Formatted Sentence = "+format);
		
	}
}
