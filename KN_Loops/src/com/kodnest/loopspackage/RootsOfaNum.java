package com.kodnest.loopspackage;
import java.util.Scanner;
public class RootsOfaNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =s.nextInt();
		if(n>0) {
			System.out.println("Square root of "+n+" = "+Math.sqrt(n));
		}
		
		if(n>0) {
			System.out.println("Cube root of "+n+" = "+Math.cbrt(n));
		}
	}
}

