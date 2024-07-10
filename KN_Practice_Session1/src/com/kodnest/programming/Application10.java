package com.kodnest.programming;
import java.util.Scanner;
public class Application10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question10 q10 = new Question10();
		System.out.println("Enter a Char");
		char c = s.next().charAt(0);
		int result = q10.decodeCharacter(c);
		System.out.println("decodeCharacter = "+result);
		
		
	}

}
