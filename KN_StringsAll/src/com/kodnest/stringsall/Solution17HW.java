package com.kodnest.stringsall;
import java.util.Scanner;
public class Solution17HW {
	public static void main(String[] args) {
		//Scanner s =new Scanner(System.in);
		String s ="Write2JavaProgramms4H.W!";
		int vowels=0;
		int consonants=0;
		int numbers=0;
		int specialcharacters=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='a' && c<='z')||c>='A' && c<='Z'){
				if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u') {
					vowels++;
				}else {
					consonants++;}
			}else if(c>=48 && c<=57) {
				numbers++;
			}else {
				specialcharacters++;
			}
			
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonats = "+consonants);
		System.out.println("Numbers = "+numbers);
		System.out.println("SpecialCharacters = "+specialcharacters);
	}
}
